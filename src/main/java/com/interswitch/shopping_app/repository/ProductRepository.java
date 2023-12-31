package com.interswitch.shopping_app.repository;

import com.interswitch.shopping_app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
