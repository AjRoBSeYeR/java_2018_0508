package com.ipartek.formacion.youtube.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Video {
	private long id;
	@NotBlank
	@Size(min=11, max=11)
	private String codigo;
	@NotBlank
	@Size(min=3, max=150)
	private String titulo;
	private String descripcion;
	private Usuario usuario;
	private List<Comentario> comentarios;

	public static final int CODIGO_LENGTH = 11;
	public static final String CODIGO_LENGTH_EXCEPTION = "La longitud del ID tiene que ser " + CODIGO_LENGTH;

	public Video() {
		super();
		this.id = -1;
		this.codigo = "UmYKPY_-ejc";
		this.titulo = "Game of Thrones - Season 7 - Main Titles";
		this.descripcion = "Esta es una descripción de ejemplo para el vídeo por defecto.";
		this.usuario = new Usuario();
		this.comentarios = new ArrayList<Comentario>();
	}

	public Video(String codigo, String titulo) throws Exception {
		this();
		setCodigo(codigo);
		this.titulo = titulo;
	}
	
	public Video(String codigo, String titulo, String descripcion) throws Exception {
		this();
		setCodigo(codigo);
		this.titulo = titulo;
		this.descripcion = descripcion;
	}
	
	public Video(String codigo, String titulo, String descripcion, List<Comentario> comentarios) throws Exception {
		this();
		setCodigo(codigo);
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.comentarios = comentarios;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws Exception {
		if (codigo != null && codigo.trim().length() == CODIGO_LENGTH)
			this.codigo = codigo;
		else
			throw new Exception(CODIGO_LENGTH_EXCEPTION);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Video [id=" + id + "codigo=" + codigo + ", titulo=" + titulo + ", usuario=" + usuario + "]";
	}
}
