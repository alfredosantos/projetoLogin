package br.com.login.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USUARIO")
@SequenceGenerator(name="usuarioSeq", sequenceName="SEQ_COD_USUARIO")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="usuarioSeq")
	@Column(name = "COD_USUARIO")
	private int codUsuario;

	@Column(name = "NOM_USUARIO")
	private String nomUsuario;
	
	@Column(name = "NOM_LOGIN")
	private String nomlogin;
	
	@Column(name = "DSC_SENHA")
	private String senha;
	
	@ManyToOne
	@JoinColumn(name = "COD_PERFIL")
	private Perfil perfilUsuario;
	
	@Column(name = "EMAIL_PERFIL")
	private String emailUsuario;

	@Column(name = "DAT_CADASTRO")
	private Date datCadastro;
	
}