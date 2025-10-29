package com.edu.sv.pruebatecnica.service;

import com.edu.sv.pruebatecnica.controller.response.CategoryResponse;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> getAllCategories();
}
