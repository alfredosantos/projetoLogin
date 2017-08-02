package br.com.login.rest;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.login.application.UserLogin;
import br.com.login.application.UsuarioBusiness;
import br.com.login.dao.Usuario;

@Controller
@RestController
@RequestMapping("usuario")
public class UsuarioController {
	public static final String JSON = "application/json";
	
	@Autowired
	private UsuarioBusiness business;

	@RequestMapping(
            value = "/buscarTodos",
            method = RequestMethod.GET,
            produces = { JSON }
    )
    public List<Usuario> buscarTodos() throws IOException {
        return business.listarCliente();
    }
	
	@RequestMapping(
            value = "/buscarPorCodigo",
            method = RequestMethod.GET,
            produces = { JSON }
    )
    public Usuario buscarPorCodigo(int codCliente) throws IOException {
        return business.buscarPorCodigo(codCliente);
    }
	
	@RequestMapping(
            value = "/incluir",
            method = RequestMethod.POST,
            produces = { JSON }
    )
    public Usuario incluir(@RequestBody Usuario cliente) throws IOException {
        return business.incluir(cliente);
    }
	
	@RequestMapping(
            value = "/excluir",
            method = RequestMethod.POST,
            produces = { JSON }
    )
    public void excluir(int codCliente) throws IOException {
		business.excluir(codCliente);
        return; 
    }

	@RequestMapping(
            value = "/login",
            method = RequestMethod.POST,
            produces = { JSON }
    )
	public ResponseEntity<?> login(@RequestBody final UserLogin login) throws Exception {

		return business.login(login);
	}


}
