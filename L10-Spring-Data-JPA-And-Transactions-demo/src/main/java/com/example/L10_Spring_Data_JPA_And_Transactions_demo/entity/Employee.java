package com.example.L10_Spring_Data_JPA_And_Transactions_demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "emp_name")
    private String name;

    @Column(unique = true, nullable = false, name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Address address;

    @ManyToOne
    @JsonIgnoreProperties("employeeSet")
    private Branch branch;
}
