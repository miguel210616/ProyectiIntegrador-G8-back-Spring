package com.tecsup.cuyope.persistence.crud;

import java.util.List;
import java.util.Optional;

import com.tecsup.cuyope.persistence.entity.Cita;

public interface CitRepository {
	
	public List<Cita> getAll();
	
	public Optional<Cita> getCita(int id);
	
	public List<Cita> getByIdCliente(int id);
	
	public Cita save(Cita cita);
		
	public void delete(int id);

}
