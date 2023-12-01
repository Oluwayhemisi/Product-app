package com.interswitch.shopping_app.service.cart;

import com.interswitch.shopping_app.dto.CustomerProductDto;
import com.interswitch.shopping_app.model.Cart;
import com.interswitch.shopping_app.model.Product;

public interface CartService {
    Double calculateSubTotal(CustomerProductDto customerProductDto);

    Cart createCart(CustomerProductDto productDto);

}
