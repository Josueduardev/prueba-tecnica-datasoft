package com.edu.sv.pruebatecnica.service.mapper;

import com.edu.sv.pruebatecnica.controller.request.BookRequest;
import com.edu.sv.pruebatecnica.controller.response.BookResponse;
import com.edu.sv.pruebatecnica.persistence.domain.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookResponse toBookResponse(Book book);

    void updateBookFromRequest(BookRequest bookRequest, @MappingTarget Book book);
}
