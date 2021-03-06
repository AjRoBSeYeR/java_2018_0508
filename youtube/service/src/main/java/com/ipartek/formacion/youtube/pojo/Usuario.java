package com.ipartek.formacion.youtube.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Usuario {
	
	private long id;
	
	@Size(min=2, max=50)
	private String nombre;
	
	@Size(min=6, max=20)
	private String password;
	
	@NotNull
	private Rol rol;
	
	
	public Usuario() {
		super();
		this.id=-1;
		this.nombre = "";
		this.password = "";
		this.rol = new Rol();
	}

		
	public Usuario(String nombre, String password) {
		this();
		this.nombre = nombre;
		this.password = password;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Rol getRol() {
		return rol;
	}


	public void setRol(Rol rol) {
		this.rol = rol;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", password=" + password + ", rol=" + rol + "]";
	}

}
