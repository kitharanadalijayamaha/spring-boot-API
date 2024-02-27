package com.example.Staff.controller;

import com.example.Staff.dto.StaffDTO;
import com.example.Staff.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/staff")
@CrossOrigin

public class StaffController {
    @Autowired
    private StaffService staffService;
    @GetMapping("/getStaff")
    public List<StaffDTO> getStaff(){
        return staffService.getAllStaff();
    }
    @PostMapping("/saveStaff")
    public StaffDTO saveStaff(@RequestBody StaffDTO staffDTO){
        return staffService.saveStaff(staffDTO);
    }
    @PutMapping("/updateStaff")
    public StaffDTO updateStaff(@RequestBody StaffDTO staffDTO) {
        return staffService.updateStaff(staffDTO);
    }
    @DeleteMapping("/deleteStaff")
    public boolean deleteStaff(@RequestBody StaffDTO staffDTO){
        return staffService.deleteStaff(staffDTO);
    }

}
