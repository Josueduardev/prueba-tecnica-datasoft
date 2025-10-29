package com.edu.sv.pruebatecnica.service.implementation;

import com.edu.sv.pruebatecnica.controller.request.BookRequest;
import com.edu.sv.pruebatecnica.controller.response.BookResponse;
import com.edu.sv.pruebatecnica.persistence.BookRepository;
import com.edu.sv.pruebatecnica.persistence.domain.Book;
import com.edu.sv.pruebatecnica.service.BookService;
import com.edu.sv.pruebatecnica.service.mapper.BookMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookResponse findById(Long id) {
        return bookRepository.findById(id)
                .map(bookMapper::toBookResponse)
                .orElseThrow(() -> new EntityNotFoundException("Book not found"));
    }

    @Override
    public List<BookResponse> findAllByCategory(Long id) {
        return bookRepository.findAllByCategoryId(id).stream()
                .map(bookMapper::toBookResponse)
                .collect(Collectors.toList());
    }

    @Override
    public BookResponse createBook(BookRequest bookRequest) {
        Book book = new Book();
        bookMapper.updateBookFromRequest(bookRequest, book);
        return bookMapper.toBookResponse(bookRepository.save(book));
    }

    @Override
    public BookResponse update(Long id, BookRequest bookRequest) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Book not found"));
        bookMapper.updateBookFromRequest(bookRequest, book);
        return bookMapper.toBookResponse(bookRepository.save(book));
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}