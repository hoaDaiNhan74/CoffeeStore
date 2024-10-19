package com.laptrinhweb.Coffee.controller;

import com.laptrinhweb.Coffee.dto.ProductDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String listProducts(Model model) {
        model.addAttribute("san-pham");
        return "layout";
    }
}
