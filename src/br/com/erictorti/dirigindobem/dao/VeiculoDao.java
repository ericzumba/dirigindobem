package br.com.erictorti.dirigindobem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.erictorti.dirigindobem.infra.JPAUtil;
import br.com.erictorti.dirigindobem.modelo.Veiculo;

@Component
public class VeiculoDao {

	private EntityManager em;
	private DAO<Veiculo> dao;

	public VeiculoDao( ) {
		EntityManagerFactory factory = new JPAUtil().getFactory();
		this.em = factory.createEntityManager();
		
		this.dao = new DAO<Veiculo>(this.em, Veiculo.class);
	}
	
	public void adiciona(Veiculo t) {		
		dao.adiciona(t);
	}

	public Veiculo busca(Integer id) {
		return dao.busca(id);
	}

	public List<Veiculo> lista() {
		return dao.lista();
	}

	public void remove(Veiculo t) {
		dao.remove(t);
	}

	public EntityManager getEntityManager() {
		return em;
	}

	
}
