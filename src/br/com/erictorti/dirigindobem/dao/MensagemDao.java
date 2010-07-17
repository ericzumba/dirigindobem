package br.com.erictorti.dirigindobem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.erictorti.dirigindobem.infra.JPAUtil;
import br.com.erictorti.dirigindobem.modelo.Mensagem;

@Component
public class MensagemDao {

	private EntityManager em;
	private DAO<Mensagem> dao;

	public MensagemDao( ) {
		EntityManagerFactory factory = new JPAUtil().getFactory();
		this.em = factory.createEntityManager();
		
		this.dao = new DAO<Mensagem>(this.em, Mensagem.class);
	}

	public void adiciona(Mensagem t) {
		dao.adiciona(t);
	}

	public Mensagem busca(Integer id) {
		return dao.busca(id);
	}

	public List<Mensagem> lista() {
		return dao.lista();
	}

	public void remove(Mensagem t) {
		dao.remove(t);
	}
	
	public EntityManager getEntityManager( ){
		return em;
	}
	
}
