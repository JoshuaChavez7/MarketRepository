package com.supermarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supermarket.entity.Client;

public interface ClientRepository extends JpaRepository<Client, String>{

}
