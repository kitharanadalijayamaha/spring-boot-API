package com.example.Bill.repo;

import com.example.Bill.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepo extends JpaRepository<Bill,Integer> {
}
