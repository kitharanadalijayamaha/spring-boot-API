package com.example.customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Customer {
    @Id
    private int id;
    private String name;
    private String address;
    private String email;
    private int number;
    private String password;
}
