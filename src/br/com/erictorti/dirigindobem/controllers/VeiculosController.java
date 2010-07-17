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
	private VeiculoDao veiculoDao;
	
	public VeiculosController( Result result, VeiculoDao dao ){
		this.veiculoDao = dao;
		this.result = result;
	}

	@Path("/veiculos/novo")
	public void formulario() {
		System.out.println( ">>formulário para novo veículo");
	}
	
	@Path("/veiculos")
	@Post
	public void adiciona( final Veiculo veiculo ) {
		System.out.println( ">>adicionando novo veículo");
		veiculoDao.getEntityManager().getTransaction().begin();
		veiculoDao.adiciona( veiculo );
		veiculoDao.getEntityManager().getTransaction().commit();
		result.redirectTo(VeiculosController.class).lista();
	}
	
	@Path("/veiculos")
	@Get
	public List<Veiculo> lista( ) {
		System.out.println( ">>listando veículos" );
		veiculoDao.getEntityManager().getTransaction().begin();
		List<Veiculo> lista = veiculoDao.lista();
		veiculoDao.getEntityManager().getTransaction().commit();
		return lista;
	}
}
