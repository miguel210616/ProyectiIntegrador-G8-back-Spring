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

import com.tecsup.cuyope.persistence.entity.Mascota;
import com.tecsup.cuyope.service.MascotaService;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/mascota")
public class MascotaController {
	
	@Autowired
	private MascotaService mascotaService;

	@GetMapping("/all")
	public List<Mascota> getAll(){
		return mascotaService.getAll();
	}
	
	@GetMapping("/idcliente/{id}")
	public List<Mascota> getByIdCliente(@PathVariable("id") int id){
		return mascotaService.getByIdCliente(id);
	}
	
	@GetMapping("/{id}")
	public Optional<Mascota> getMascota(@PathVariable("id") int id){
		return mascotaService.getMascota(id);
	}
		
	@PostMapping("/save")
	public Mascota save(@RequestBody Mascota cliente) {
		return mascotaService.save(cliente);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable("id") int id) {
		return mascotaService.delete(id);
	}
}
