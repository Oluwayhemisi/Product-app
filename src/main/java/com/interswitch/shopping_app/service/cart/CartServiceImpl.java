package com.interswitch.shopping_app.service.cart;

import com.interswitch.shopping_app.dto.CustomerProductDto;
import com.interswitch.shopping_app.model.Cart;
import com.interswitch.shopping_app.repository.CartRepository;
import com.interswitch.shopping_app.repository.ProductRepository;
import com.interswitch.shopping_app.service.cart.CartService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImpl implements CartService {
 @Autowired
  private CartRepository cartRepository;
 @Autowired
 private ProductRepository productRepository;

    @Override
    public Double calculateSubTotal(CustomerProductDto customerProductDto) {
       return customerProductDto.getUnitPrice() * customerProductDto.getQuantity();

    }

    @Override
    public Cart createCart(CustomerProductDto productDto) {
        if (cartRepository.findById(productDto.getProductId()).isPresent()) {


        }
        Cart cart = new Cart();
        cart.setQuantity(productDto.getQuantity());
        cart.setProductId(productDto.getProductId());
        cart.setUnitPrice(productDto.getUnitPrice());
        cart.setProductName(cart.getProductName());
        return cartRepository.save(cart);

    }


}
