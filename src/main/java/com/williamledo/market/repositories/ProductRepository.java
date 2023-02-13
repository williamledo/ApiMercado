package com.williamledo.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.market.entities.Category;
import com.williamledo.market.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
