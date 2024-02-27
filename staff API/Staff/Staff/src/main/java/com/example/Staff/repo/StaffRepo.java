package com.example.Staff.repo;

import com.example.Staff.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepo extends JpaRepository<Staff,Integer> {
}
