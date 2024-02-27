package com.example.menu.service;

import com.example.menu.dto.MenuDTO;
import com.example.menu.entity.Menu;
import com.example.menu.repo.MenuRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

public class MenuService {
    @Autowired
    private MenuRepo menuRepo;
    @Autowired
    private ModelMapper modelMapper;
    public MenuDTO saveMenu(MenuDTO menuDTO){
        menuRepo.save(modelMapper.map(menuDTO, Menu.class));
        return menuDTO;
    }
    public List<MenuDTO>getAllMenu(){
        List<Menu>menuList=menuRepo.findAll();
        return modelMapper.map(menuList,new TypeToken<List<MenuDTO>>(){}.getType());
    }
    public MenuDTO updateMenu(MenuDTO menuDTO){
        menuRepo.save(modelMapper.map(menuDTO,Menu.class));
        return  menuDTO;
    }
    public boolean deleteMenu(MenuDTO menuDTO){
        menuRepo.delete(modelMapper.map(menuDTO,Menu.class));
        return true;
    }

}
