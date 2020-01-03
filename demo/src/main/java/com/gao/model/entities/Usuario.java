package com.gao.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gao.enums.EstadoUsuario;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column(name = "user")
	private String usuario;
	
	@Column
	private String password;
	
	@Column(name = "nombre_apellido")
	private String nombreApellido;
	
	@Column(name = "e_mail")
	private String eMail;
	
	@Column
	@Enumerated(EnumType.STRING)
	private EstadoUsuario estado;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name="rol_id", nullable=false)
	private Rol rol;
	
	public Usuario() {
		
	}

	public Usuario(Integer id, String usuario, String password, String nombreApellido, String eMail,
			EstadoUsuario estado, Rol rol) {
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.nombreApellido = nombreApellido;
		this.eMail = eMail;
		this.estado = estado;
		this.rol = rol;
	}

	public Usuario(String usuario, String password, String nombreApellido, String eMail, EstadoUsuario estado,
			Rol rol) {
		this.usuario = usuario;
		this.password = password;
		this.nombreApellido = nombreApellido;
		this.eMail = eMail;
		this.estado = estado;
		this.rol = rol;
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

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	
}
