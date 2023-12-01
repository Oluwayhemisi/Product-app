package com.interswitch.shopping_app.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private Integer productId;

    private String productName;

    private String description;

    private Double unitPrice;

    private Integer quantity;

    private Double subTotal;



}
