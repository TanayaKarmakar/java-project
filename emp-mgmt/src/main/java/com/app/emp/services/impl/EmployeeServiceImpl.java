package com.app.emp.services.impl;

import com.app.emp.entity.EmployeeEntity;
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
    public List<EmployeeEntity> getAll() {
        List<EmployeeEntity> employees = new ArrayList<>();
        Iterator<EmployeeEntity> empItr = employeeRepository.findAll().iterator();
        while(empItr.hasNext()) {
            employees.add(empItr.next());
        }
        return employees;
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        employee.setId(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }
}
