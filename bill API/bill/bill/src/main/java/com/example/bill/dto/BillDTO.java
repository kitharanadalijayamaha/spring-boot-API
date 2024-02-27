package com.example.bill.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class BillDTO {
    private int id;
    private String name;
    private String food_name;
    private double total_price;
    private String payment_method;
}
