package com.edu.sv.pruebatecnica.service.implementation;

import com.edu.sv.pruebatecnica.controller.response.CategoryResponse;
import com.edu.sv.pruebatecnica.persistence.CategoryRepository;
import com.edu.sv.pruebatecnica.service.CategoryService;
import com.edu.sv.pruebatecnica.service.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public List<CategoryResponse> getAllCategories() {
        return categoryMapper.toCategoryResponseList(categoryRepository.findAll());
    }
}
