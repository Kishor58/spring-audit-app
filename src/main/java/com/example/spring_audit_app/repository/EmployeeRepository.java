package com.example.spring_audit_app.repository;

import com.example.spring_audit_app.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
