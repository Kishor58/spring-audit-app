package com.example.spring_audit_app.controller;

import com.example.spring_audit_app.model.Employee;
import com.example.spring_audit_app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee saved = employeeService.saveEmployee(employee);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
        Employee employee = employeeService.getEmployee(id);
        return ResponseEntity.ok(employee);
    }
}
