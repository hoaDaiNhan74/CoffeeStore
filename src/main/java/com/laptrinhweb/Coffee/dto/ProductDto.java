package com.laptrinhweb.Coffee.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDto {
    private Long id;
    private Long typeId;
    private String nameProduct;
    private String DVT;
    private String price;
}
