package com.tecsup.cuyope.persistence.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tecsup.cuyope.persistence.entity.Cita;

public interface CitaCrudRepository extends CrudRepository<Cita, Integer> {
	
	List<Cita> findByIdCliente(int id);

}
