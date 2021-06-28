package com.tecsup.cuyope.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.cuyope.persistence.crud.ClientRepository;
import com.tecsup.cuyope.persistence.entity.Cliente;

@Service
public class ClienteService {

	@Autowired
	private ClientRepository clientRepository;
	
	public List<Cliente> getAll(){
		return clientRepository.getAll();
	}
	
	public Optional<Cliente> getCliente(int id){
		return clientRepository.getCliente(id);
	}
	
	public Cliente getClienteCorreo(String correo){
		return clientRepository.getByCorreo(correo);
	}

	public Cliente save(Cliente cliente) {
		return clientRepository.save(cliente);
	}

	
	public boolean delete(int id) {
		if (getCliente(id).isPresent()) {
			clientRepository.delete(id);
			return true;
		}else {
			return false;
		}
	}
	
	
}
