package com.ipartek.formacion.prestamolibros.pojo;

public class Libro {

	private long id;
	private String titulo;
	private String isbn;
	private Editorial editorial;
	private boolean prestado;
	
	public Libro() {
		super();
		this.id=-1;
		this.titulo="";
		this.isbn="";
		this.editorial= new Editorial();
		this.prestado=false;
	}

	public Libro(long id, String titulo, String isbn, Editorial editorial,boolean prestrado) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.isbn = isbn;
		this.editorial = editorial;
		this.prestado = prestrado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", isbn=" + isbn + ", editorial=" + editorial + ", prestado="
				+ prestado + "]";
	}

	
	
}
