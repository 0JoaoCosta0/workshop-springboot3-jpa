package com.Costa.projetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Costa.projetoSpringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
