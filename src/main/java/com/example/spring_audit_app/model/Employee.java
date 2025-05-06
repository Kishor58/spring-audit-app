package com.example.spring_audit_app.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String employeeName;
    private String email;
    private String contact;
    private String address;
    private LocalDate joiningDate;

    @ManyToOne
    private Department department;
}
