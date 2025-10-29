package com.edu.sv.pruebatecnica.controller;

import com.edu.sv.pruebatecnica.controller.request.BookRequest;
import com.edu.sv.pruebatecnica.controller.response.BookResponse;
import com.edu.sv.pruebatecnica.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @GetMapping("/category/{id}")
    public List<BookResponse> getAllBooksByCategories(@PathVariable final Long id) {
        return bookService.findAllByCategory(id);
    }

    @GetMapping("/{id}")
    public BookResponse getBookById(@PathVariable final Long id) {
        return bookService.findById(id);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public BookResponse createBook(@Valid @RequestBody final BookRequest bookRequest) {
        return bookService.createBook(bookRequest);
    }

    @PutMapping("/{id}")
    public BookResponse updateBook(@PathVariable final Long id, @Valid @RequestBody final BookRequest bookRequest) {
        return bookService.update(id, bookRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public void deleteBook(@PathVariable final Long id) {
        bookService.delete(id);
    }
}
