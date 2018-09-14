package com.indra.desafio.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

@Entity
public class ClientePrincipal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nomeCompleto;
	@CPF
	@NotBlank(message="CPF invalido.")
	private String cpf;
	
	private String dataNasc;
	
	private Sexo sexo;
	
	private int numQuarto;
	
	private int telefone;

	public ClientePrincipal() {};
	
	public ClientePrincipal(Long id, String nomeCompleto, @CPF String cpf, String dataNasc, Sexo sexo, int numQuarto) {
		super();
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.numQuarto = numQuarto;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}

	@Override
	public String toString() {
		return "ClientePrincipal [id=" + id + ", nomeCompleto=" + nomeCompleto + ", cpf=" + cpf + ", dataNasc="
				+ dataNasc + ", sexo=" + sexo + ", numQuarto=" + numQuarto + "]";
	}
}