package com.iviberberi.kberestbrewery.web.mappers;

import com.iviberberi.kberestbrewery.domain.Customer;
import com.iviberberi.kberestbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;


@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
