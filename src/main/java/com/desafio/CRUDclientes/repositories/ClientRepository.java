package com.desafio.CRUDclientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.CRUDclientes.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	
}
