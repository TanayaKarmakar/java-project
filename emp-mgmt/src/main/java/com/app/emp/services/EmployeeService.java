package com.app.emp.services;

import com.app.emp.domain.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();

    public Employee createEmployee(Employee employee);
}
