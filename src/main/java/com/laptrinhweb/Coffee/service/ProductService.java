package com.laptrinhweb.Coffee.service;

import com.laptrinhweb.Coffee.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAllProduct();
}
