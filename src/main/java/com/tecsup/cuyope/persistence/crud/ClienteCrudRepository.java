package com.tecsup.cuyope.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.tecsup.cuyope.persistence.entity.Cliente;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer>{

	Cliente findByCorreo(String correo);
}
