package br.com.login.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PERFIL")
@SequenceGenerator(name="perfilSeq", sequenceName="SEQ_PERFIL")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Perfil {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="perfilSeq")
	@Column(name = "COD_PERFIL")
	private int codPerfil;

	@Column(name = "NOM_PERFIL")
	private String nomPerfil;
	
	@Column(name = "DSC_PERFIL")
	private String dscPerfil;
	
}
