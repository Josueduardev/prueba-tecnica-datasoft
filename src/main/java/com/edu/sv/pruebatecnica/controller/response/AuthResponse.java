package com.edu.sv.pruebatecnica.controller.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthResponse {
    private String username;
    private String token;
}
