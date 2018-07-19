package com.ipartek.formacion.pojo;

public class Libro {

	// TODO HAcer DAO, y hacer una APP de Consola, listar libros, y decir si esta
	// prestado o no

	// TODO dos listas, prestados y no prestados, y buscador por titulo

	// TODO libros: fariña, lengua trimestral, matematicas trimestral, la voz del
	// alma

	// TODO lengua

	private static final int LONG_ISBN = 5; 
	
	// Atributos
	private long id;
	private String titulo;
	private String isbn;
	private String editorial;
	private boolean prestado;
	// TODO FECHA

	// Cronstructores
	public Libro() {
		super();
	}

	public Libro(long id, String titulo, String isbn, String editorial, boolean prestado) throws Exception {

		this();
		this.id = id;
		this.titulo = titulo;
		this.editorial = editorial;
		setIsbn(isbn);
		this.prestado = prestado;

	}

	// Getters y Setters
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

	public void setIsbn(String isbn) throws Exception {

		if (isbn != null) {
			if (isbn.length() > LONG_ISBN) {
				this.isbn = isbn;
			} else {
				throw new Exception();
			}
		} else {
			throw new Exception();
		}

	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	// toString

	@Override
	public String toString() {
		return "Libro: id=" + id + ", titulo=" + titulo + ", isbn=" + isbn + ", editorial=" + editorial + ", "
				+ ((prestado) ? "Esta prestado" : "No esta prestado") + "\n";
	}

}
