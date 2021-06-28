package com.tecsup.cuyope.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.cuyope.persistence.crud.MascotRepository;
import com.tecsup.cuyope.persistence.entity.Mascota;

@Service
public class MascotaService {
	
	@Autowired
	private MascotRepository mascotRepository;
	
	public List<Mascota> getAll(){
		return mascotRepository.getAll();
	}
	
	public Optional<Mascota> getMascota	(int id){
		return mascotRepository.getMascota(id);
	}
	
	public List<Mascota> getByIdCliente(int id){
		return mascotRepository.getByIdCliente(id);
	}

	public Mascota save(Mascota cliente) {
		return mascotRepository.save(cliente);
	}

	public boolean delete(int id) {
		if (getMascota(id).isPresent()) {
			mascotRepository.delete(id);
			return true;
		}else {
			return false;
		}
	}
	
}
