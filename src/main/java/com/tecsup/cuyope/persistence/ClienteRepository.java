package com.tecsup.cuyope.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tecsup.cuyope.persistence.crud.ClientRepository;
import com.tecsup.cuyope.persistence.crud.ClienteCrudRepository;
import com.tecsup.cuyope.persistence.entity.Cliente;

@Repository
public class ClienteRepository implements ClientRepository{

	@Autowired
	private ClienteCrudRepository clienteCrudRepository;
	
	@Override
	public List<Cliente> getAll() {
		return (List<Cliente>)clienteCrudRepository.findAll();
	}

	@Override
	public Optional<Cliente> getCliente(int id) {
		return clienteCrudRepository.findById(id);
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clienteCrudRepository.save(cliente);
	}

	@Override
	public void delete(int id) {
		clienteCrudRepository.deleteById(id);		
	}

	@Override
	public Cliente getByCorreo(String correo) {
		return clienteCrudRepository.findByCorreo(correo);
	}

}
