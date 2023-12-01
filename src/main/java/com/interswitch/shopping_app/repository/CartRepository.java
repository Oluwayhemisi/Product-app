package com.interswitch.shopping_app.repository;

import com.interswitch.shopping_app.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
