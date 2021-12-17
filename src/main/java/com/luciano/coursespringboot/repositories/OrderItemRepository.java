package com.luciano.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.coursespringboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
