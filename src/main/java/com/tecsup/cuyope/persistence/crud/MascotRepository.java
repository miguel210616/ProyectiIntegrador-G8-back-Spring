package com.tecsup.cuyope.persistence.crud;

import java.util.List;
import java.util.Optional;

import com.tecsup.cuyope.persistence.entity.Mascota;

public interface MascotRepository {

	public List<Mascota> getAll();
	
	public Optional<Mascota> getMascota(int id);
	
	public List<Mascota> getByIdCliente(int id);
	
	public Mascota save(Mascota mascota);
		
	public void delete(int id);
	
}
