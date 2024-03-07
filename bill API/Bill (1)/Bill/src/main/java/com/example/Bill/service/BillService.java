package com.example.Bill.service;

import com.example.Bill.dto.BillDTO;
import com.example.Bill.entity.Bill;
import com.example.Bill.repo.BillRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

public class BillService {
    @Autowired
    private BillRepo billRepo;
    @Autowired
    private ModelMapper modelMapper;
    public BillDTO saveBill(BillDTO billDTO){
        billRepo.save(modelMapper.map(billDTO, Bill.class));
        return billDTO;


    }
    public List<BillDTO>getAllBill(){
        List<Bill>billList=billRepo.findAll();
        return modelMapper.map(billList,new TypeToken<List<BillDTO>>(){}.getType());
    }
    public BillDTO updateBill(BillDTO billDTO){
        billRepo.save(modelMapper.map(billDTO,Bill.class));
        return billDTO;
    }
    public boolean deleteBill(BillDTO billDTO){
        billRepo.delete(modelMapper.map(billDTO,Bill.class));
        return true;
    }


}
