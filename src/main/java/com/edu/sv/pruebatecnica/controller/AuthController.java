package com.edu.sv.pruebatecnica.controller;

import com.edu.sv.pruebatecnica.controller.request.AuthRequest;
import com.edu.sv.pruebatecnica.controller.request.UserRequest;
import com.edu.sv.pruebatecnica.controller.response.UserResponse;
import com.edu.sv.pruebatecnica.security.JwtUtil;
import com.edu.sv.pruebatecnica.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/auth")
public class AuthController {


    private final JwtUtil jwtUtils;
    private final UserService userService;
    private final AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public String login(@Valid @RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authRequest.getUsername(),
                        authRequest.getPassword()
                )
        );
        final UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        return jwtUtils.generateToken(userDetails.getUsername());
    }

    @PostMapping("/register")
    @ResponseStatus(CREATED)
    public UserResponse registerUser(@Valid @RequestBody final UserRequest userRequest) {
        return userService.createUser(userRequest);
    }
}
