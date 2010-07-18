package br.com.erictorti.dirigindobem.controllers;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.erictorti.dirigindobem.dao.MensagemDao;
import br.com.erictorti.dirigindobem.modelo.Mensagem;

@Resource
public class MensagemController {

	private Result result;
	private MensagemDao mensagemDao;

	public MensagemController(Result result, MensagemDao mensagemDao) {
		this.result = result;
		this.mensagemDao = mensagemDao;
	}
	
	@Path("/mensagem/nova")
	public void formulario( ) {
		System.out.println( ">> formulário para nova mensagem");
	}
	
	@Path("/mensagem")
	@Post
	public void adiciona( Mensagem mensagem ) {
		mensagemDao.adiciona( mensagem );
		result.redirectTo(MensagemController.class).lista( );
	}
	
	@Path("/mensagem/{id}")
	@Get
	public Mensagem edita( Integer id ) {
		return mensagemDao.busca(id);
	}
	
	@Path("/mensagem/{mensagem.id}") 
	@Put
	public void atualiza( Mensagem mensagem ){
		mensagemDao.atualiza(mensagem);
		result.redirectTo(MensagemController.class).lista( );
	}
	
	@Path("/mensagens")
	@Get
	public List<Mensagem> lista( ) {
		List<Mensagem> lista = mensagemDao.lista();
		return mensagemDao.lista();
	}
	
}
