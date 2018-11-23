package com.andrea.perez.youtube.pojo;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Usuario {
	private long id;
	
	@NotBlank
	@Size(min=2,max=50)
	private String nombre;
	@NotBlank
	@Size(min=6,max=20)
	private String contrasena;
	private Rol rol;

	public Usuario() {
		super();
		this.id = -1;
		this.nombre = "";
		this.contrasena = "";
		this.rol = new Rol();

	}

	public Usuario(String nombre, String contraseña) {
		this();
		this.nombre = nombre;
		this.contrasena = contraseña;
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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contraseña) {
		this.contrasena = contraseña;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", contrasena=" + contrasena + ", rol=" + rol + "]";
	}

	

}