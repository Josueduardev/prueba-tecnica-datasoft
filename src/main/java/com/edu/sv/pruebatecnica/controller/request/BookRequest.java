package com.edu.sv.pruebatecnica.controller.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;


@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookRequest {
    @NotBlank
    private String name;

    @NotBlank
    private String summary;

    @NotNull
    private BigDecimal price;

    @NotBlank
    private String state;

    private String imageUrl;

    @NotNull
    private Long idCategory;

    @NotNull
    private Long idUser;
}
