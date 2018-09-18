package com.indra.desafio.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_pessoa;

	@Column(nullable = false)
	@Size(max=50)
	private String nome;

	@CPF
	@Column(nullable = false)
	private String cpf;

	@Column(nullable = false)
	private Sexo sexo;

	@Column(nullable = false)
	private int numero_quarto;

	@Column(nullable = false)
	private int telefone;

	@Column(nullable = false)
	private Pessoa pessoa_prin;

	public Pessoa() {

	}

	public Pessoa(Long id_pessoa, String nome, String cpf, Sexo sexo,  int numero_quarto, int telefone, Pessoa pessoa_prin) {
		super();
		this.id_pessoa = id_pessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.numero_quarto = numero_quarto;
		this.telefone = telefone;
		this.pessoa_prin = pessoa_prin;
	}

	public Long getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(Long id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumero_quarto() {
		return numero_quarto;
	}

	public void setNumero_quarto(int numero_quarto) {
		this.numero_quarto = numero_quarto;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Pessoa getPessoa_prin() {
		return pessoa_prin;
	}

	public void setPessoa_prin(Pessoa pessoa_prin) {
		this.pessoa_prin = pessoa_prin;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [id_pessoa=" + id_pessoa + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo
				+ ", numero_quarto=" + numero_quarto + ", telefone=" + telefone + ", pessoa_prin=" + pessoa_prin + "]";
	}
}