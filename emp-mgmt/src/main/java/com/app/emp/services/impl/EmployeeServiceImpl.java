package com.app.emp.services.impl;

import com.app.emp.domain.Employee;
import com.app.emp.repositories.EmployeeRepository;
import com.app.emp.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        Iterator<Employee> empItr = employeeRepository.findAll().iterator();
        while(empItr.hasNext()) {
            employees.add(empItr.next());
        }
        return employees;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employee.setId(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }
}
