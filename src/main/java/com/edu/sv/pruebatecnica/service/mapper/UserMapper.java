package com.edu.sv.pruebatecnica.service.mapper;

import com.edu.sv.pruebatecnica.controller.response.UserResponse;
import com.edu.sv.pruebatecnica.persistence.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse toUserResponse(final User securityUser);
}
