package com.williamledo.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.market.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
