package br.com.erictorti.dirigindobem.controllers;

import java.util.List;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.erictorti.dirigindobem.dao.VeiculoDao;
import br.com.erictorti.dirigindobem.modelo.Veiculo;

@Resource
public class VeiculoController {

	private Result result;
	private VeiculoDao veiculoDao;
	private Validator validator;

	public VeiculoController(Result result, VeiculoDao dao) {
		this.veiculoDao = dao;
		this.result = result;
		ValidatorFactory buildDefaultValidatorFactory = Validation.buildDefaultValidatorFactory();
		validator = buildDefaultValidatorFactory.getValidator();
		
	}

	@Path("/veiculo/novo")
	public void formulario() {
		System.out.println(">>formulário para novo veículo");
	}

	@Path("/veiculo")
	@Post
	public void adiciona(final Veiculo veiculo) {
		System.out.println(">>adicionando novo veículo");
		veiculoDao.adiciona(veiculo);
		result.redirectTo(VeiculoController.class).lista();
	}

	@Path("/veiculo/{id}")
	@Get
	public Veiculo edita(Integer id) {
		return veiculoDao.busca(id);
	}
	
	@Path("/veiculo/{veiculo.id}")
	@Put
	public void atualiza(Veiculo veiculo){
		veiculoDao.atualiza(veiculo);
		result.redirectTo(VeiculoController.class).lista();
	}

	@Path("/veiculos")
	@Get
	public List<Veiculo> lista() {
		System.out.println(">>listando veículos");
		List<Veiculo> lista = veiculoDao.lista();
		return lista;
	}
}
