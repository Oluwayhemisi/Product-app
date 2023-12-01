package com.interswitch.shopping_app.service.customer;

import com.interswitch.shopping_app.dto.CustomerDto;
import com.interswitch.shopping_app.dto.UpdateCustomerDto;
import com.interswitch.shopping_app.exception.CustomerException;
import com.interswitch.shopping_app.model.Customer;

import java.util.List;

public interface CustomerService{
    CustomerDto createCustomer(Long id,CustomerDto customerDto) throws CustomerException;
    Customer getCustomerById(Long id) throws CustomerException;

    UpdateCustomerDto updateCustomer(Long id, UpdateCustomerDto updateCustomerDto) throws CustomerException;
    List<Customer> getAllCustomers();
    void delete(Long id) throws CustomerException;


}
