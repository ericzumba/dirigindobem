package br.com.erictorti.dirigindobem.controllers;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.erictorti.dirigindobem.dao.MensagemDao;
import br.com.erictorti.dirigindobem.modelo.Mensagem;

@Resource
public class MensagensController {

	private Result result;
	private MensagemDao mensagemDao;

	public MensagensController(Result result, MensagemDao mensagemDao) {
		this.result = result;
		this.mensagemDao = mensagemDao;
	}
	
	@Path("/mensagens/nova")
	public void formulario( ) {
		System.out.println( ">> formulário para nova mensagem");
	}
	
	@Path("/mensagens")
	@Post
	public void adiciona( Mensagem mensagem ) {
		mensagemDao.getEntityManager().getTransaction().begin();
		mensagemDao.adiciona( mensagem );
		mensagemDao.getEntityManager().getTransaction().commit();
		result.redirectTo(MensagensController.class).lista( );
	}
	
	@Path("/mensagens")
	@Get
	public List<Mensagem> lista( ) {
		mensagemDao.getEntityManager().getTransaction().begin();
		List<Mensagem> lista = mensagemDao.lista();
		mensagemDao.getEntityManager().getTransaction().commit();
		return mensagemDao.lista();
	}
	
}
