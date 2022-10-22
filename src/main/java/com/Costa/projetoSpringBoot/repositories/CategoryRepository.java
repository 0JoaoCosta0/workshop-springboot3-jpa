package com.Costa.projetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Costa.projetoSpringBoot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
