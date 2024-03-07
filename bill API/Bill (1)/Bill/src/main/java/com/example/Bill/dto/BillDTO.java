package com.example.Bill.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class BillDTO {
    private int cus_id;
    private String cus_name;
    private String menu_title;
    private int quantity;
    private double total_price;
    private String payment_method;
}
