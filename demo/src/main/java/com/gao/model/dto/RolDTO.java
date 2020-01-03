package com.gao.model.dto;

import java.io.Serializable;

public class RolDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String descripcion;
	
	public RolDTO() {
		
	}

	public RolDTO(Integer id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public RolDTO(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
