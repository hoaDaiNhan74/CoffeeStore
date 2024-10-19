package com.laptrinhweb.Coffee.repository;

import com.laptrinhweb.Coffee.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByNameProduct(String nameProduct);
}
