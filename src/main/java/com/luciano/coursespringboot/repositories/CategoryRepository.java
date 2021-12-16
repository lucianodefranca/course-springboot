package com.luciano.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.coursespringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
