package br.com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.login.dao.Usuario;

@Repository
@Transactional
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	Usuario findByNomlogin(String nomlogin);
}
