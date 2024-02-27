package com.example.customer.controller;

import com.example.customer.dto.CustomerDTO;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/customer")
@CrossOrigin

public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/getCustomer")
    public List<CustomerDTO> getCustomer(){
        return customerService.getAllCustomer();
    }
    @PostMapping("/saveCustomer")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.saveCustomer(customerDTO);
    }
    @PutMapping("/updateCustomer")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.updateCustomer(customerDTO);
    }
    @DeleteMapping("/deleteCustomer")
    public boolean deleteCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.deleteCustomer(customerDTO);
    }
}
