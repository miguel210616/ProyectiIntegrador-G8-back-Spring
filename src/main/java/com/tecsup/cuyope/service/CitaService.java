package com.tecsup.cuyope.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.cuyope.persistence.CitaRepository;
import com.tecsup.cuyope.persistence.entity.Cita;

@Service
public class CitaService {
	
	@Autowired
	CitaRepository citaRepository;
	
	public List<Cita> getAll(){
		return citaRepository.getAll();
	}
	
	public Optional<Cita> getCita(int id){
		return citaRepository.getCita(id);
	}
	
	public List<Cita> getByIdCliente(int id){
		return citaRepository.getByIdCliente(id);
	}

	public Cita save(Cita cita) {		
		return citaRepository.save(cita);
	}

	public boolean delete(int id) {
		if (getCita(id).isPresent()) {
			citaRepository.delete(id);
			return true;
		}else {
			return false;
		}
	}

}
