package com.ipartek.formacion.pojo;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Alumno {
	private long id;
	@NotBlank
	@Size(min=2,max=150)
	private String nombre;
	
	public Alumno() {
		super();
		this.id = -1;
		this.nombre = "";
	}
	
	public Alumno(long id, String nombre) {
		this();
		this.id = id;
		this.nombre = nombre;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + "]";
	}
}
