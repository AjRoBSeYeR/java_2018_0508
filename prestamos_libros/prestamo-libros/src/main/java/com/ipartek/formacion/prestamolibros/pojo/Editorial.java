package com.ipartek.formacion.prestamolibros.pojo;

public class Editorial {
	private String editorial;
	private long id;

	public Editorial() {
		super();
		this.editorial = "";
		this.id=-1;
	}

	public Editorial(String editorial, long id) {
		this();
		this.editorial = editorial;
		this.id=id;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Editorial [editorial=" + editorial + ", id=" + id + "]";
	}

	

}
