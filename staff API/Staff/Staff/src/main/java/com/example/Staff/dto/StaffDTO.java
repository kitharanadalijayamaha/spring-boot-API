package com.example.Staff.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class StaffDTO {
    private int id;
    private String first_name;
    private String last_name;
    private String address;
    private String number;
}
