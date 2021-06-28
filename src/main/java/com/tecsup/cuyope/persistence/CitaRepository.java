package com.tecsup.cuyope.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tecsup.cuyope.persistence.crud.CitRepository;
import com.tecsup.cuyope.persistence.crud.CitaCrudRepository;
import com.tecsup.cuyope.persistence.entity.Cita;

@Repository
public class CitaRepository implements CitRepository{

	@Autowired
	private CitaCrudRepository citaCrudRepository;

	@Override
	public List<Cita> getAll() {
		return (List<Cita>)citaCrudRepository.findAll();
	}

	@Override
	public Optional<Cita> getCita(int id) {
		return citaCrudRepository.findById(id);
	}

	@Override
	public Cita save(Cita cita) {
		return citaCrudRepository.save(cita);
	}

	@Override
	public void delete(int id) {
		citaCrudRepository.deleteById(id);
	}

	@Override
	public List<Cita> getByIdCliente(int id) {
		return citaCrudRepository.findByIdCliente(id);
	}

	

}
