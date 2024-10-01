package com.example.springbootgraphqlserver.repository;

import com.example.springbootgraphqlserver.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
