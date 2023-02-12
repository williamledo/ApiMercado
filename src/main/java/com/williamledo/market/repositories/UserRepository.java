package com.williamledo.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williamledo.market.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
