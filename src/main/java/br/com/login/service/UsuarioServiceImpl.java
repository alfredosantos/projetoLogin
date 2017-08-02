package br.com.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.login.dao.Usuario;
import br.com.login.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	
	@Override
	public Usuario findOne(int codUsuario) {
		return usuarioRepository.findOne(codUsuario);
	}

	@Override
	public Usuario incluir(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public void excluir(int codUsuario) {
		usuarioRepository.delete(codUsuario);
		return;
	}

	@Override
	public Usuario findByNomlogin(String nomlogin) {
		return usuarioRepository.findByNomlogin(nomlogin);
	}

}
