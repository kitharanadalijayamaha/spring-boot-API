package com.example.menu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MenuDTO {
    private int id;
    private String food_name;
    private double price;
    private int quantity;
}
