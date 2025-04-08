package com.example.L10_Spring_Data_JPA_And_Transactions_demo.controller;

import com.example.L10_Spring_Data_JPA_And_Transactions_demo.entity.Branch;
import com.example.L10_Spring_Data_JPA_And_Transactions_demo.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @PostMapping
    public ResponseEntity<Branch> createBranch(@RequestBody Branch branch) {
        branch = branchService.create(branch);
        return ResponseEntity.ok(branch);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Branch> getBranch(@PathVariable Long id) {
        return ResponseEntity.ok(branchService.get(id));
    }
}
