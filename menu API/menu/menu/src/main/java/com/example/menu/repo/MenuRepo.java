package com.example.menu.repo;

import com.example.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu,Integer> {
}
