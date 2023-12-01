package com.interswitch.shopping_app.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class CustomerDto {
    private String name;
    private String phoneNumber;
    private String address;
    private String wallet;

    private Double balance;
    private LocalDate registeredDate;
}
