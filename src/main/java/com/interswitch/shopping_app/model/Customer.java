package com.interswitch.shopping_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Shop_Customers")
public class Customer {
    private Long id;
    private String name;
    private String phoneNumber;
    private String address;
    private String wallet;

    private Double balance;
    private LocalDate registeredDate;

}
