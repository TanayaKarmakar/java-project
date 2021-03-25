package com.app.emp.mappers;

import com.app.emp.bo.Customer;
import com.app.emp.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerBOEntityMapper {
    CustomerEntity boToEntity(Customer customer);

    Customer entityToBo(CustomerEntity customerEntity);
}
