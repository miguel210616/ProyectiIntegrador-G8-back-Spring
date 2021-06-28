package com.tecsup.cuyope.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="cita")
public class Cita {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cita")
	private Integer idCita;
	
	@NotNull
	@Column(name="id_cliente")
	private Integer idCliente;
	@NotNull
	private String mascotaa;
	@NotNull
	private String veterinario;
	@NotNull
	private Date fecha;
	@NotNull
	private String hora;
	
	@ManyToOne
	@JoinColumn(name="id_cliente", insertable=false, updatable=false)
	private Cliente clientec;

	public Cliente getClientec() {
		return clientec;
	}
	public void setClientec(Cliente clientec) {
		this.clientec = clientec;
	}
	public Integer getIdCita() {
		return idCita;
	}
	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getMascotaa() {
		return mascotaa;
	}
	public void setMascotaa(String mascotaa) {
		this.mascotaa = mascotaa;
	}
	public String getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}

	

}
