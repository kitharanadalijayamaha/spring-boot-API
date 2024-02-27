package com.example.Staff.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Staff {
    @Id
    private int id;
    private String first_name;
    private String last_name;
    private String address;
    private String number;
}
