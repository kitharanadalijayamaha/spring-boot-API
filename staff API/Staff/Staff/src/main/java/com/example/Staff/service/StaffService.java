package com.example.Staff.service;

import com.example.Staff.dto.StaffDTO;
import com.example.Staff.entity.Staff;
import com.example.Staff.repo.StaffRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

public class StaffService {
    @Autowired
    private StaffRepo staffRepo;
    @Autowired
    private ModelMapper modelMapper;

    public StaffDTO saveStaff(StaffDTO staffDTO){
        staffRepo.save(modelMapper.map(staffDTO, Staff.class));
        return staffDTO;
    }
    public List<StaffDTO> getAllStaff(){
        List<Staff>staffList=staffRepo.findAll();
        return modelMapper.map(staffList,new TypeToken<List<StaffDTO>>(){}.getType());
    }
    public StaffDTO updateStaff(StaffDTO staffDTO){
        staffRepo.save(modelMapper.map(staffDTO,Staff.class));
        return staffDTO;
    }
    public boolean deleteStaff(StaffDTO staffDTO){
        staffRepo.delete(modelMapper.map(staffDTO,Staff.class));
        return true;
    }
}
