package com.example.menu.controller;

import com.example.menu.dto.MenuDTO;
import com.example.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/menu")
@CrossOrigin

public class MenuController {
    @Autowired
    private MenuService menuService;
    @GetMapping("/getMenu")
    public List<MenuDTO> getMenu(){
        return menuService.getAllMenu();
    }
    @PostMapping("/saveMenu")
    public MenuDTO saveMenu(@RequestBody MenuDTO menuDTO){
        return menuService.saveMenu(menuDTO);
    }
    @PutMapping("/updateMenu")
    public MenuDTO updateMenu(@RequestBody MenuDTO menuDTO){
        return menuService.updateMenu(menuDTO);
    }
    @DeleteMapping("/deleteMenu")
    public boolean deleteMenu(@RequestBody MenuDTO menuDTO){
        return menuService.deleteMenu(menuDTO);
    }
}
