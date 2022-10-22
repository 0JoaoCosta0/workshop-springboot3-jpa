package com.Costa.projetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Costa.projetoSpringBoot.entities.OrderItem;
import com.Costa.projetoSpringBoot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
