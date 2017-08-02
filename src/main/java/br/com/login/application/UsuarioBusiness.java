package br.com.login.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import br.com.login.dao.Perfil;
import br.com.login.dao.Usuario;
import br.com.login.security.LoginResponse;
import br.com.login.security.TokenUtil;
import br.com.login.service.UsuarioService;

@Component
public class UsuarioBusiness {

	@Autowired
	public UsuarioService service;

	@Autowired
	ApplicationContext context;

	@Autowired
	TokenUtil tks;

	public List<Usuario> listarCliente() {
		return service.findAll();
	}

	public Usuario buscarPorCodigo(int codCliente) {
		return service.findOne(codCliente);
	}

	public Usuario incluir(Usuario cliente) {
		return service.incluir(cliente);
	}

	public void excluir(int codCliente) {
		service.excluir(codCliente);
		return;
	}

	public ResponseEntity<?>  login(UserLogin login) {
		try {
			Usuario usuario = service.findByNomlogin(login.name);
			if (usuario.getSenha().equals(login.password)) {
				return new ResponseEntity(tks.createToken(login.name, usuario.getPerfilUsuario().getNomPerfil()), HttpStatus.ACCEPTED);
			}
			return new ResponseEntity<String>("Usuario ou Senha incorretos", HttpStatus.UNAUTHORIZED);
		} catch (Exception e) {
			return new ResponseEntity<Exception>(e, HttpStatus.UNAUTHORIZED);
		}

	}

}
