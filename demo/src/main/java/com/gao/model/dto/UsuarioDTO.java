package com.gao.model.dto;

import java.io.Serializable;

import com.gao.enums.EstadoUsuario;

public class UsuarioDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String usuario;
	private String password;
	private String nombreApellido;
	private String eMail;
	private EstadoUsuario estado;
	
	public UsuarioDTO() {
		
	}
	
	public UsuarioDTO(Integer id, String usuario, String password, String nombreApellido, String eMail,
			EstadoUsuario estado) {
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.nombreApellido = nombreApellido;
		this.eMail = eMail;
		this.estado = estado;
	}
	public UsuarioDTO(String usuario, String password, String nombreApellido, String eMail, EstadoUsuario estado) {
		this.usuario = usuario;
		this.password = password;
		this.nombreApellido = nombreApellido;
		this.eMail = eMail;
		this.estado = estado;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public EstadoUsuario getEstado() {
		return estado;
	}
	public void setEstado(EstadoUsuario estado) {
		this.estado = estado;
	}
	
	
}
