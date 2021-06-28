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

import com.tecsup.cuyope.persistence.entity.Cita;
import com.tecsup.cuyope.service.CitaService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/cita")
public class CitaController {

	@Autowired
	private CitaService citaService;
	
	@GetMapping("/all")
	public List<Cita> getAll(){
		return citaService.getAll();
	}
	
	@GetMapping("/idcliente/{id}")
	public List<Cita> getByIdCliente(@PathVariable("id") int id){
		return citaService.getByIdCliente(id);
	}
	
	@GetMapping("/{id}")
	public Optional<Cita> getCita(@PathVariable("id") int id){
		return citaService.getCita(id);
	}
		
	
	@PostMapping("/save")
	public Cita save(@RequestBody Cita cita) {
		return citaService.save(cita);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") int id) {
		return citaService.delete(id);
	}
	
}
