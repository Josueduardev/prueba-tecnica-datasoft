package com.edu.sv.pruebatecnica.controller.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import lombok.*;

import org.springframework.hateoas.server.core.Relation;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Relation(collectionRelation = "books", itemRelation = "book") // For update the name in the response
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookResponse {

    private Long id;

    private String name;

    private String summary;

    private BigDecimal price;

    private String state;

    private String imageUrl;
}
