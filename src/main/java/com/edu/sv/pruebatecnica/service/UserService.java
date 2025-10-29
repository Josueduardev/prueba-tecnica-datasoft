package com.edu.sv.pruebatecnica.service;

import com.edu.sv.pruebatecnica.controller.request.UserRequest;
import com.edu.sv.pruebatecnica.controller.response.UserResponse;


public interface UserService {
    UserResponse createUser(final UserRequest userRequest);
}
