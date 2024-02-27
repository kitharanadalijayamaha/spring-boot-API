package com.example.bill.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Bill {
    @Id
    private int id;
    private String name;
    private String food_name;
    private double total_price;
    private String payment_method;
}
