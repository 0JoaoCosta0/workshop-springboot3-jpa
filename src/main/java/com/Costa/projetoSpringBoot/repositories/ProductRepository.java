package com.Costa.projetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Costa.projetoSpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
