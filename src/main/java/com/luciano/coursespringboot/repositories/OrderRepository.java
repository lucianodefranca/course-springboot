package com.luciano.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.coursespringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
