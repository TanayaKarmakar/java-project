package com.app.emp.repositories;

import com.app.emp.entity.CustomerEntity;
import com.azure.spring.data.cosmos.repository.CosmosRepository;

public interface CustomerRepository extends CosmosRepository<CustomerEntity, String> {
}
