package br.com.erictorti.dirigindobem.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.erictorti.dirigindobem.infra.JPAUtil;
import br.com.erictorti.dirigindobem.modelo.Veiculo;

public class TestaHibernate {

	public static void main(String[] args) {
		EntityManagerFactory factory = JPAUtil.getFactory();
		EntityManager em = factory.createEntityManager();
	
		Veiculo veiculo = new Veiculo();
		veiculo.setPlaca("lalala");
		
		em.getTransaction().begin();
		em.persist(veiculo);
		em.getTransaction().commit();

		System.out.println("gravado");
	}
}
