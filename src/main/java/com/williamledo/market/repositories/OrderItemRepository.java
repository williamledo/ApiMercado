package com.williamledo.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.market.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
