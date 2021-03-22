package com.app.emp.repositories;

import com.app.emp.domain.Customer;
import com.azure.spring.data.cosmos.repository.CosmosRepository;

public interface CustomerRepository extends CosmosRepository<Customer, String> {
}
