package com.edu.sv.pruebatecnica.service;

import com.edu.sv.pruebatecnica.controller.request.BookRequest;
import com.edu.sv.pruebatecnica.controller.response.BookResponse;

import java.util.List;

public interface BookService {

    List<BookResponse> findAll();

    BookResponse findById(final Long id);

    List<BookResponse> findAllByCategory(Long id);

    BookResponse createBook(final BookRequest bookRequest);

    BookResponse update(final Long id, final BookRequest bookRequest);

    void delete(final Long id);
}
