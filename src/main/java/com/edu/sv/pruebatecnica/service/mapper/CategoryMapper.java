package com.edu.sv.pruebatecnica.service.mapper;

import com.edu.sv.pruebatecnica.controller.response.CategoryResponse;
import com.edu.sv.pruebatecnica.persistence.domain.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    List<CategoryResponse> toCategoryResponseList(final List<Category> categoryList);
}
