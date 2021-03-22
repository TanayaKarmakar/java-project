package com.app.emp.repositories;

import com.app.emp.domain.Employee;
import com.azure.spring.data.cosmos.repository.CosmosRepository;

public interface EmployeeRepository extends CosmosRepository<Employee, String> {
}
