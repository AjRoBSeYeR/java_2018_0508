package com.ipartek.formacion.pojo;
 
public class VideoYoutube implements Cloneable{
	
	

	private long id;
	private String titulo;
	private String codigo;
	
	public VideoYoutube() {
		super();
		this.setId(-1);
		this.setTitulo("");
		this.setCodigo("");
	}
	
	public VideoYoutube(long id, String titulo, String codigo) {
		this();
		this.setId(id);
		this.setTitulo(titulo);
		this.setCodigo(codigo);
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
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "VideoYoutube [id=" + id + ", titulo=" + titulo + ", codigo=" + codigo + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VideoYoutube other = (VideoYoutube) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (id != other.id)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
}
