package com.example.spring_audit_app.repository;

import com.example.spring_audit_app.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
