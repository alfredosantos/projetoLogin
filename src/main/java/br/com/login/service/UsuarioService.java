package br.com.login.service;

import java.util.List;

import br.com.login.dao.Usuario;

public interface UsuarioService {

	List<Usuario> findAll();

	Usuario findOne(int codCliente);
	
	Usuario incluir(Usuario cliente);
	
	void excluir(int codCliente);
	
	Usuario findByNomlogin(String nomlogin);

}
