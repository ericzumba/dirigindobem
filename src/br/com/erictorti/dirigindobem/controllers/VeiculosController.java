package br.com.erictorti.dirigindobem.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.erictorti.dirigindobem.dao.DAO;
import br.com.erictorti.dirigindobem.dao.VeiculoDao;
import br.com.erictorti.dirigindobem.infra.JPAUtil;
import br.com.erictorti.dirigindobem.modelo.Veiculo;

@Resource
public class VeiculosController {
	
	private Result result;
	private VeiculoDao dao;
	
	
	public VeiculosController( Result result, VeiculoDao dao ){
		this.dao = dao;
		this.result = result;
	}

	@Path("/veiculos/novo")
	public void formulario() {
		System.out.println( ">>formulário para novo veículo");
	}
	
	@Path("/veiculos")
	@Post
	public void adiciona( final Veiculo veiculo ) {
		System.out.println( ">>adiciona novo veículo " + veiculo.getPlaca());
		dao.getEntityManager().getTransaction().begin();
		dao.adiciona( veiculo );
		dao.getEntityManager().getTransaction().commit();
		result.redirectTo(VeiculosController.class).lista();
	}
	
	@Path("/veiculos")
	@Get
	public List<Veiculo> lista( ) {
		List<Veiculo> lista = new ArrayList<Veiculo>();
		System.out.println( ">>listando veículos" );
		dao.getEntityManager().getTransaction().begin();
		lista = dao.lista();
		dao.getEntityManager().getTransaction().commit();
		return lista;
	}
}
