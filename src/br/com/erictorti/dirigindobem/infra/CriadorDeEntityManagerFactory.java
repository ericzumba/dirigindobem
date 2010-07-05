package br.com.erictorti.dirigindobem.infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

public class CriadorDeEntityManagerFactory implements ComponentFactory<EntityManagerFactory> {
	
	private EntityManagerFactory factory;
	
	@PostConstruct
	public void abre() {
		this.factory = Persistence.createEntityManagerFactory("jpadirigindobem");
		System.out.println( "Criada factory");
	}

	@Override
	public EntityManagerFactory getInstance() {
		return factory;
	}

	@PreDestroy
	public void fecha() {
		this.factory.close();
	}
	
	

}
