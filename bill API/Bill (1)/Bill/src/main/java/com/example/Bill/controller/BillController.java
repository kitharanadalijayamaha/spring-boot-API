package com.example.Bill.controller;

import com.example.Bill.dto.BillDTO;
import com.example.Bill.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/bill")
@CrossOrigin

public class BillController {
    @Autowired
    private BillService billService;
    @GetMapping("/getBill")
    public List<BillDTO> getBill(){
        return billService.getAllBill();
    }
    @PostMapping("/saveBill")
    public BillDTO saveBill(@RequestBody BillDTO billDTO){
        return billService.saveBill(billDTO);
    }
    @PutMapping("/updateBill")
    public BillDTO updateBill(@RequestBody BillDTO billDTO){
        return billService.updateBill(billDTO);
    }
    @DeleteMapping("/deleteBill")
    public boolean deleteBill(@RequestBody BillDTO billDTO){
        return billService.deleteBill(billDTO);
    }
}
