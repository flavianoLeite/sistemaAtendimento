package br.com.atendimento.model.domain;

import java.util.Date;

public class Contato {
	private String nome;
	private String telefone;
	private Date data;
	private Operadora operadora;
	private String serial;
	
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public Operadora getOperadora() {
		return operadora;
	}
	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	


}
