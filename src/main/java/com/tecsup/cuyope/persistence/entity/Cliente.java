package com.tecsup.cuyope.persistence.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	private String apellidos;
	@NotNull
	private String nombres;
	@NotNull
	private String correo;
		
	private String sexo;
	
	private Integer dni;
	
	private String direccion;
	
	private Integer celular;
	
	@Column(name="fecha_afiliacion")
	private Date fechaAfilicacion;
	
	@OneToMany(mappedBy="cliente")
	private List<Mascota> mascotas;
	
	
	@OneToMany(mappedBy="clientec")
	private List<Cita> citas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public Date getFechaAfilicacion() {
		return fechaAfilicacion;
	}

	public void setFechaAfilicacion(Date fechaAfilicacion) {
		this.fechaAfilicacion = fechaAfilicacion;
	}


	
		
	
}
