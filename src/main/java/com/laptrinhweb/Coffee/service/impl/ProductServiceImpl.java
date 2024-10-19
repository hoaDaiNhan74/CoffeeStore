package com.laptrinhweb.Coffee.service.impl;

import com.laptrinhweb.Coffee.dto.ProductDto;
import com.laptrinhweb.Coffee.models.Product;
import com.laptrinhweb.Coffee.repository.ProductRepository;
import com.laptrinhweb.Coffee.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDto> findAllProduct() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(this::mapToProductDto)
                .collect(Collectors.toList());
    }

    private ProductDto mapToProductDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .typeId(product.getTypeId())
                .nameProduct(product.getNameProduct())
                .DVT(product.getDVT())
                .price(product.getPrice())
                .build();
    }
}
