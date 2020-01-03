package com.gao.test;

import java.util.List;

import com.gao.model.dao.IUsuarioDao;
import com.gao.model.dao.imp.UsuarioDaoImp;
import com.gao.model.entities.Usuario;

/*
 * Test de usuarios
 */
public class TestUsuario {

	public static void main(String[] args) {
		IUsuarioDao usuarioDao = new UsuarioDaoImp();
		List<Usuario> lista = usuarioDao.getAll(Usuario.class);
		System.out.println(lista.size());

	}

}
