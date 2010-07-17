package br.com.erictorti.dirigindobem.controllers;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.erictorti.dirigindobem.dao.VeiculoDao;
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
		veiculoDao.adiciona( veiculo );
		result.redirectTo(VeiculosController.class).lista();
	}
	
	@Path("/veiculos")
	@Get
	public List<Veiculo> lista( ) {
		System.out.println( ">>listando veículos" );
		List<Veiculo> lista = veiculoDao.lista();
		return lista;
	}
}
