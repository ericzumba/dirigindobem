package br.com.erictorti.dirigindobem.dao;

import java.util.List;

import javax.persistence.EntityManager;

public class DAO<T> {
	
	private EntityManager em;

	private final Class<T> classe;
	
	public DAO( EntityManager em, Class<T> classe ) {
		this.em = em;
		this.classe = classe;
	}
	
	public void adiciona( T t ) {
		this.em.persist(t);
	}

	public void atualiza( T t ) {
		this.em.merge(t);
	}
	
	public void remove( T t ) {
		this.em.remove(t);
	}
	
	public T busca( Integer id ) {
		return em.getReference(classe, id);
	}
	
	public List<T> lista() {
		return em.createQuery( "from " + classe.getName()).getResultList();
	}
	
}
