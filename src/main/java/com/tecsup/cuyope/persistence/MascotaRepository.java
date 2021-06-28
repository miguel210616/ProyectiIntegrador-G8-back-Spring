package com.tecsup.cuyope.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tecsup.cuyope.persistence.crud.MascotRepository;
import com.tecsup.cuyope.persistence.crud.MascotaCrudRepository;
import com.tecsup.cuyope.persistence.entity.Mascota;

@Repository
public class MascotaRepository implements MascotRepository{

	@Autowired
	private MascotaCrudRepository mascotaCrudRepository;
	
	@Override
	public List<Mascota> getAll() {
		return (List<Mascota>)mascotaCrudRepository.findAll();
	}

	@Override
	public Optional<Mascota> getMascota(int id) {
		return mascotaCrudRepository.findById(id);
	}

	@Override
	public Mascota save(Mascota mascota) {
		return mascotaCrudRepository.save(mascota);
	}

	@Override
	public void delete(int id) {
		mascotaCrudRepository.deleteById(id);
	}

	@Override
	public List<Mascota> getByIdCliente(int id) {
		return mascotaCrudRepository.findByIdCliente(id);
	}

}
