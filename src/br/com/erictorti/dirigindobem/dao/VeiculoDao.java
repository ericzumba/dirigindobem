package br.com.erictorti.dirigindobem.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.ioc.Component;
import br.com.erictorti.dirigindobem.modelo.Veiculo;

@Component
public class VeiculoDao {

	private EntityManager em;
	private DAO<Veiculo> dao;

	public VeiculoDao(EntityManager em) {
		this.em = em;
		this.dao = new DAO<Veiculo>(this.em, Veiculo.class);
	}

	public void adiciona(Veiculo t) {
		dao.adiciona(t);
	}

	public Veiculo busca(Integer id) {
		return dao.busca(id);
	}

	public List<Veiculo> lista() {
		List<Veiculo> veiculos = dao.lista();
		return veiculos;

	}

	public void remove(Veiculo t) {
		dao.remove(t);
	}

	public EntityManager getEntityManager() {
		return em;
	}

}
