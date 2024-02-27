package com.example.bill.repo;

import com.example.bill.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepo extends JpaRepository<Bill,Integer> {
}
