package com.app.emp.repositories;

import com.app.emp.entity.EmployeeEntity;
import com.azure.spring.data.cosmos.repository.CosmosRepository;

public interface EmployeeRepository extends CosmosRepository<EmployeeEntity, String> {
}
