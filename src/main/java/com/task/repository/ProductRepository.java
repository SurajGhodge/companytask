package com.task.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import com.task.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	 @EntityGraph(attributePaths = {"category"})
	    Optional<Product> findById(Long id);
}