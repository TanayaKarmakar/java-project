package com.app.emp.mappers;

import com.app.emp.bo.Customer;
import com.app.emp.common.request.CustomerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface CustomerRequestBOMapper {
    @Mappings({
          @Mapping(source = "orders", target = "orders")
    })
    Customer dtoToBo(CustomerRequest customerRequest);

    @Mappings({
            @Mapping(source = "orders", target = "orders")
    })
    CustomerRequest boToDto(Customer customer);
}
