package com.example.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CustomerDTO {
    private int id;
    private String name;
    private String address;
    private String email;
    private int number;
    private String password;
}
