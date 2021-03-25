package com.app.emp.services;

import com.app.emp.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    public List<EmployeeEntity> getAll();

    public EmployeeEntity createEmployee(EmployeeEntity employee);
}
