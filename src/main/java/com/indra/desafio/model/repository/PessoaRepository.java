package com.indra.desafio.model.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.indra.desafio.model.entity.Pessoa;

@Repository
public class PessoaRepository {
	@Autowired
	EntityManager em;
	
	public void save(Pessoa pessoa) {
		em.persist(pessoa);
	}
	
	public void update(Pessoa pessoa) {
		em.merge(pessoa);
	}
	
	public void delete(Long id) {
		em.remove(id);
	}
	
	public List<Pessoa> findAll(){
		return em.createQuery("select p from Categoria p", Pessoa.class).getResultList();
	}
}