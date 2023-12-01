package com.interswitch.shopping_app.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Shop_Products")
public class Product {
    private Long id;
    private String name;
    private String description;
    private Double unitPrice;
    private Integer quantityInStock;
    private String dateCreated;
    private Boolean available;

}
