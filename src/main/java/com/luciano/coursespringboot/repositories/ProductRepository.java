package com.luciano.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.coursespringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
