package com.tecsup.cuyope.persistence.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tecsup.cuyope.persistence.entity.Mascota;

public interface MascotaCrudRepository extends CrudRepository<Mascota, Integer> {

	List<Mascota> findByIdCliente(int id);
	
}
