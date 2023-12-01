package com.interswitch.shopping_app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
public class CustomerProductDto {
    private Long customerId;

    private Long productId;

    private Double unitPrice;

    private Integer quantity;

    private String orderCode;

    private Date createdDate;
}
