package com.Costa.projetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Costa.projetoSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
