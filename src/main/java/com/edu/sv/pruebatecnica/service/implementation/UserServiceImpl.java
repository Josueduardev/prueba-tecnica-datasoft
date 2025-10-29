package com.edu.sv.pruebatecnica.service.implementation;

import com.edu.sv.pruebatecnica.controller.request.UserRequest;
import com.edu.sv.pruebatecnica.controller.response.UserResponse;
import com.edu.sv.pruebatecnica.persistence.UserRepository;
import com.edu.sv.pruebatecnica.persistence.domain.User;
import com.edu.sv.pruebatecnica.service.UserService;
import com.edu.sv.pruebatecnica.service.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {

    private final PasswordEncoder passwordEncoder;

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public UserResponse createUser(final UserRequest userRequest) {

        if (userRepository.existsByUsername(userRequest.getUsername())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User already exists");
        }

        final User user = User
                .builder()
                .username(userRequest.getUsername())
                .fullName(userRequest.getFullName())
                .state(userRequest.getState())
                .passwordHash(passwordEncoder.encode(userRequest.getPassword()))
                .build();
        return userMapper.toUserResponse(userRepository.save(user));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPasswordHash(),
                Collections.emptyList()
        );
    }
}

