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
import javax.ws.rs.core.Response;

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
	
	/*@GET
	@Path("/contatos")
	public List<Object> listar() {		
		Contato contato = new Contato();
		Operadora operadora = new Operadora();
		operadora.setCategoria("Fixo");
		operadora.setCodigo(25);
		operadora.setNome("GVT");		

		contato.setOperadora(operadora);
		contato.setNome("João");
		contato.setData(new Date());
		contato.setTelefone("31 -64598-8978");
		List<Object> lista = new ArrayList<Object>();
		lista.add(contato);
		return lista;
	}*/
	
	@GET
	@Path("/contatos")
	public List<Contato> listarContatos() {	
		Operadora op1 = new Operadora();
		op1.setCategoria("Fixo");
		op1.setCodigo(25);
		op1.setNome("GVT");	
		
		Operadora op2 = new Operadora();
		op2.setCategoria("Celular");
		op2.setCodigo(14);
		op2.setNome("Oi");
		op2.setPreco(1.0);
		
		Operadora op3 = new Operadora();
		op3.setCategoria("Celular");
		op3.setCodigo(15);
		op3.setNome("Vivo");
		op3.setPreco(2.0);
		
		Operadora op4 = new Operadora();
		op4.setCategoria("Celular");
		op4.setCodigo(41);
		op4.setNome("Tim");
		op4.setPreco(4.0);
		
		Operadora op5 = new Operadora();
		op5.setCategoria("Celular");
		op5.setCodigo(21);
		op5.setNome("Embratel");
		op5.setPreco(5.0);
		
		List<Contato> lista = new ArrayList<Contato>();
		Contato c1 = new Contato();
		c1.setOperadora(op1);
		c1.setNome("Carlos AUGUSTO");
		c1.setData(new Date());
		c1.setTelefone("31 -12345-8978");
		lista.add(c1);
		
		Contato c2 = new Contato();
		c2.setOperadora(op2);
		c2.setNome("João roberto");
		c2.setData(new Date());
		c2.setTelefone("31 -98574-8978");
		lista.add(c2);
		
		Contato c3 = new Contato();
		c3.setOperadora(op3);
		c3.setNome("Maria Jose");
		c3.setData(new Date());
		c3.setTelefone("31 -85274-8978");
		lista.add(c3);
		
		Contato c4 = new Contato();
		c4.setOperadora(op4);
		c4.setNome("Flaviano Da Silva");
		c4.setData(new Date());
		c4.setTelefone("31 -96585-8978");
		lista.add(c4);
		
		Contato c5 = new Contato();
		c5.setOperadora(op5);
		c5.setNome("Roberto DA BaHia");
		c5.setData(new Date());
		c5.setTelefone("31 -32145-8978");
		lista.add(c5);
		
		return lista;		
	}
	
	@GET
	@Path("/operadoras")
	public List<Operadora> listarOperadoras() {
		
		List<Operadora> lista = new ArrayList<Operadora>();
		Operadora op1 = new Operadora();
		op1.setCategoria("Fixo");
		op1.setCodigo(25);
		op1.setNome("GVT");		
		op1.setPreco(7.0);
		lista.add(op1);
		
		Operadora op2 = new Operadora();
		op2.setCategoria("Celular");
		op2.setCodigo(14);
		op2.setNome("Oi");
		op2.setPreco(1.0);
		lista.add(op2);
		
		Operadora op3 = new Operadora();
		op3.setCategoria("Celular");
		op3.setCodigo(15);
		op3.setNome("Vivo");
		op3.setPreco(2.0);
		lista.add(op3);
		
		Operadora op4 = new Operadora();
		op4.setCategoria("Celular");
		op4.setCodigo(41);
		op4.setNome("Tim");
		op4.setPreco(4.0);
		lista.add(op4);
		
		Operadora op5 = new Operadora();
		op5.setCategoria("Celular");
		op5.setCodigo(21);
		op5.setNome("Embratel");
		op5.setPreco(5.0);
		lista.add(op5);
		
		return lista;		
	}
	
	@POST
	@Path("/contatos")
	public void salvar(Contato contato) {
		System.out.println("Salvou contato: "+contato);
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
