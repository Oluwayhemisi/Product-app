package com.interswitch.shopping_app.service.customer;


import com.interswitch.shopping_app.dto.CustomerDto;
import com.interswitch.shopping_app.dto.UpdateCustomerDto;
import com.interswitch.shopping_app.exception.CustomerException;
import com.interswitch.shopping_app.model.Customer;
import com.interswitch.shopping_app.repository.CustomerRepository;
import com.interswitch.shopping_app.service.customer.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, ModelMapper modelMapper) {
        this.customerRepository = customerRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CustomerDto createCustomer( Long id,CustomerDto customerDto) throws CustomerException {
        if(customerRepository.findById(id).isPresent()){
            throw new CustomerException("Customer Id Exist",404);
        }
        if(customerRepository.findByPhoneNumber(customerDto.getPhoneNumber()).isPresent()){
            throw new CustomerException("Customer Number exist", 404);
        }
        Customer customer = new Customer();

        customer.setName(customerDto.getName());
        customer.setPhoneNumber(customerDto.getPhoneNumber());
        customer.setAddress(customerDto.getAddress());
        customer.setWallet(generateCustomerWalletId());
        customer.setBalance(customerDto.getBalance());
        customer.setRegisteredDate(LocalDate.now());
        Customer customer1 = customerRepository.save(customer);
        return modelMapper.map(customer1,CustomerDto.class);


    }

    @Override
    public Customer getCustomerById(Long id) throws CustomerException {
        Customer customer = customerRepository.findById(id).orElseThrow(()-> new CustomerException("Customer Id Does Not Exist",404));
        return customer;
    }

    @Override
    public UpdateCustomerDto updateCustomer(Long id, UpdateCustomerDto updateCustomerDto) throws CustomerException {
        Customer customer = customerRepository.findById(id).orElseThrow(()-> new CustomerException("Customer Id Does Not Exist",404));
        Customer savedCustomer = modelMapper.map(updateCustomerDto,Customer.class);
        customer.setName(updateCustomerDto.getName());
        customer.setPhoneNumber(updateCustomerDto.getPhoneNumber());
        customer.setAddress(updateCustomerDto.getAddress());
        customer.setBalance(updateCustomerDto.getBalance());
        customerRepository.save(customer);
        return modelMapper.map(savedCustomer,UpdateCustomerDto.class);

    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();

    }

    @Override
    public void delete(Long id) throws CustomerException {

        Customer customer = customerRepository.findById(id).orElseThrow(()-> new CustomerException("Customer Id Does Not Exist",404));
        customerRepository.delete(customer);

    }

    private String generateCustomerWalletId(){
        String id = String.valueOf( UUID.randomUUID().getLeastSignificantBits()).substring(1,9);
        return "44"+id;
    }

}
