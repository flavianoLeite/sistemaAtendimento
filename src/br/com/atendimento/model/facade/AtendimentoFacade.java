package br.com.atendimento.model.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.atendimento.model.domain.Atendimento;
import br.com.atendimento.model.domain.Contato;
import br.com.atendimento.model.domain.Operadora;
import br.com.atendimento.model.service.AtendimentoService;

@Path("/atendimento")
@Produces({ "application/json" })
public class AtendimentoFacade {

	@Inject
	private AtendimentoService service;

	@GET
	@Path("/")
	public List<Atendimento> listarTodos() {
		return service.listarTodos();
	}
	
	private List<Contato> listaContatos = new ArrayList<Contato>();
	private List<Operadora> listaOperadora = new ArrayList<Operadora>();
	
	
		
	public AtendimentoFacade() {
		Operadora op1 = new Operadora();
		op1.setCategoria("Fixo");
		op1.setCodigo(25);
		op1.setNome("GVT");	
		listaOperadora.add(op1);
		
		Operadora op2 = new Operadora();
		op2.setCategoria("Celular");
		op2.setCodigo(14);
		op2.setNome("Oi");
		op2.setPreco(1.0);
		listaOperadora.add(op2);
		
		Operadora op3 = new Operadora();
		op3.setCategoria("Celular");
		op3.setCodigo(15);
		op3.setNome("Vivo");
		op3.setPreco(2.0);
		listaOperadora.add(op3);
		
		Operadora op4 = new Operadora();
		op4.setCategoria("Celular");
		op4.setCodigo(41);
		op4.setNome("Tim");
		op4.setPreco(4.0);
		listaOperadora.add(op4);
		
		Operadora op5 = new Operadora();
		op5.setCategoria("Celular");
		op5.setCodigo(21);
		op5.setNome("Embratel");
		op5.setPreco(5.0);
		listaOperadora.add(op5);
		
		
		Contato c1 = new Contato();
		c1.setOperadora(op1);
		c1.setNome("Carlos AUGUSTO");
		c1.setData(new Date());
		c1.setTelefone("31 -12345-8978");
		listaContatos.add(c1);
		
		Contato c2 = new Contato();
		c2.setOperadora(op2);
		c2.setNome("João roberto");
		c2.setData(new Date());
		c2.setTelefone("31 -98574-8978");
		listaContatos.add(c2);
		
		Contato c3 = new Contato();
		c3.setOperadora(op3);
		c3.setNome("Maria Jose");
		c3.setData(new Date());
		c3.setTelefone("31 -85274-8978");
		listaContatos.add(c3);
		
		Contato c4 = new Contato();
		c4.setOperadora(op4);
		c4.setNome("Flaviano Da Silva");
		c4.setData(new Date());
		c4.setTelefone("31 -96585-8978");
		listaContatos.add(c4);
		
		Contato c5 = new Contato();
		c5.setOperadora(op5);
		c5.setNome("Roberto DA BaHia");
		c5.setData(new Date());
		c5.setTelefone("31 -32145-8978");
		listaContatos.add(c5);
	}

	@GET
	@Path("/contatos")
	public List<Contato> listarContatos() {
		return listaContatos;		
	}
	
	@GET
	@Path("/operadoras")
	public List<Operadora> listarOperadoras() {
		return listaOperadora;		
	}
	
	@POST
	@Path("/contatos")
	public void salvar(Contato contato) {
		listaContatos.add(contato);
	}
		

	/*@POST
	@Path("/")
	public void salvar(Atendimento atendimento) {
		service.salvar(atendimento);
	}*/

	@DELETE
	@Path("/{protocolo}")
	public void remover(@PathParam("protocolo") Integer protocolo) {
		service.remover(protocolo);
	}

}
