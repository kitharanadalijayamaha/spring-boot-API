package com.example.Bill.entity;

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
    private int cus_id;
    private String cus_name;
    private String menu_title;
    private int quantity;
    private double total_price;
    private String payment_method;
}
