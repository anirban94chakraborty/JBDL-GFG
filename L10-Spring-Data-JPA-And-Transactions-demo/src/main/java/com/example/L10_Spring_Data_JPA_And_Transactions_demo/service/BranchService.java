package com.example.L10_Spring_Data_JPA_And_Transactions_demo.service;

import com.example.L10_Spring_Data_JPA_And_Transactions_demo.entity.Branch;
import com.example.L10_Spring_Data_JPA_And_Transactions_demo.repository.BranchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchService {

    @Autowired
    private BranchRepo branchRepo;

    public Branch create(Branch branch) {
        branch = branchRepo.save(branch);
        return branch;
    }

    public Branch get(Long id) {
        Branch branch = branchRepo.findById(id).get();
        return branch;
    }
}
