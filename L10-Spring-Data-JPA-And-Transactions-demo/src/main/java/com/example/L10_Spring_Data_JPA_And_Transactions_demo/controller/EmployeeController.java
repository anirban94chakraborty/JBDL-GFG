package com.example.L10_Spring_Data_JPA_And_Transactions_demo.controller;


import com.example.L10_Spring_Data_JPA_And_Transactions_demo.dto.EmployeeDetailReq;
import com.example.L10_Spring_Data_JPA_And_Transactions_demo.entity.Employee;
import com.example.L10_Spring_Data_JPA_And_Transactions_demo.exception.IdCardNotAllocatedException;
import com.example.L10_Spring_Data_JPA_And_Transactions_demo.exception.LaptopNotAllocatedException;
import com.example.L10_Spring_Data_JPA_And_Transactions_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmp() {
        List<Employee> employees = employeeService.getAllEmp();
        return ResponseEntity.ok(employees);
    }

    @PostMapping
    public ResponseEntity<Employee> createEmp(@RequestBody EmployeeDetailReq employeeDetailReq) throws LaptopNotAllocatedException, IdCardNotAllocatedException {
        Employee employee = employeeService.createEmpWithTxn(employeeDetailReq);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/byEmail")
    public ResponseEntity<Employee> getEmpByEmail(@RequestParam String email) {
        Employee employee = employeeService.byEmail(email);
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/byEmailAndName")
    public ResponseEntity<Employee> getEmpByEmailAndName(@RequestParam String email, @RequestParam String name) {
        Employee employee = employeeService.byEmailAndName(email, name);
        return ResponseEntity.ok(employee);
    }
}
