package com.edu.sv.pruebatecnica.persistence;

import com.edu.sv.pruebatecnica.persistence.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository  extends JpaRepository<Book, Long> {
    List<Book> findAllByCategoryId(Long id);
}
