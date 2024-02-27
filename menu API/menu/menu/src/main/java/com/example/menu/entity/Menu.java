package com.example.menu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Menu {
    @Id
    private int id;
    private String food_name;
    private double price;
    private int quantity;
}
