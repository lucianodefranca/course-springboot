package com.luciano.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luciano.coursespringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
