package com.laptrinhweb.Coffee.controller;

import com.laptrinhweb.Coffee.dto.ProductDto;
import com.laptrinhweb.Coffee.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/san-pham")
    public String listProducts(Model model) {
        List<ProductDto> products = productService.findAllProduct();
        model.addAttribute("san-pham", products);
        return "list-product";
    }
}
