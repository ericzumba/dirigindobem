package br.com.erictorti.dirigindobem.infra;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory;
	
	static {
		factory = Persistence.createEntityManagerFactory( "jpadirigindobem");
	}

	public static EntityManagerFactory getFactory() {
		return factory;
	}
	
	
}
