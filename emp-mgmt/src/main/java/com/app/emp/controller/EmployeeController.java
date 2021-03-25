package com.app.emp.controller;

import com.app.emp.entity.EmployeeEntity;
import com.app.emp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<EmployeeEntity> getAllEmployees() {
        return employeeService.getAll();
    }

    @PostMapping
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee) {
        return employeeService.createEmployee(employee);
    }
}
