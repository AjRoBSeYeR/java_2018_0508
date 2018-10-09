package com.andrea.perez.pojo;

public class Usuario {
	private long id;
	private String nombre;
	private String contrasena;
	private Rol rol;// TODO crear pojo y tabla bbdd 'Rol'

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

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
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

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", contrasena=" + contrasena + ", rol=" + rol + "]";
	}

}
