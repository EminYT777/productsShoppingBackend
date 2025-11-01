package com.example.productsShoppping.entity.repository;


import com.example.productsShoppping.entity.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByUser_Username(Long productId, String username);
}
