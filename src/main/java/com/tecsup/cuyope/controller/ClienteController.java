package com.tecsup.cuyope.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tecsup.cuyope.persistence.entity.Cliente;
import com.tecsup.cuyope.service.ClienteService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/all")
	public List<Cliente> getAll(){
		return clienteService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> getCliente(@PathVariable("id") int id){
		return clienteService.getCliente(id);
	}
		
	@GetMapping("/correo/{correo}")
	public Cliente getCliente(@PathVariable("correo") String correo){
		return clienteService.getClienteCorreo(correo);
	}
	
	@PostMapping("/save")
	public Cliente save(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") int id) {
		return clienteService.delete(id);
	}
	
}
