package com.tecsup.cuyope.persistence.crud;

import java.util.List;
import java.util.Optional;

import com.tecsup.cuyope.persistence.entity.Cliente;

public interface ClientRepository {

	public List<Cliente> getAll();
	
	public Optional<Cliente> getCliente(int id);
	
	public Cliente getByCorreo(String correo);
	
	public Cliente save(Cliente cliente);
		
	public void delete(int id);
	
}
