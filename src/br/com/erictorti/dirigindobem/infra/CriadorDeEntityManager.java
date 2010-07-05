package br.com.erictorti.dirigindobem.infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

public class CriadorDeEntityManager implements ComponentFactory<EntityManager> {

	private EntityManagerFactory factory;
	private EntityManager entityManager;
	
	public CriadorDeEntityManager( EntityManagerFactory factory ) {
		this.factory = factory;
	}
	
	@PostConstruct
	public void abre() {
		this.entityManager = factory.createEntityManager();
		System.out.println( "Criada entity manager pelo criador");
	}
	
	@Override
	public EntityManager getInstance() {
		return factory.createEntityManager();
	}
	
	@PreDestroy
	public void fecha() {
		this.entityManager.close();
	}
}
