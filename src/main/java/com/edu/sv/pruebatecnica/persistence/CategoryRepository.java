package com.edu.sv.pruebatecnica.persistence;

import com.edu.sv.pruebatecnica.persistence.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Long> {
}
