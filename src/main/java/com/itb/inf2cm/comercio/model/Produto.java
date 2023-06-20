package com.itb.inf2cm.comercio.model;

public class Produto {

	private Long id;
	private String nome;
	private String codigoDeBarras;
	private String descricao;
	private double preco;
	
	// public : Acesso liberado para todas as classes
	// private: Acesso liberado apenas para os membros da própria
	//          classe, ou seja, só é acessado dentro da classe.
	
	//Métodos Setter´s e Getter´s : Utilizamos para atribuir e recuperar informações
	//de um referido atributo "RESPECTIVAMENTE". Para cada atributo teremos o set e o get.
	
	public void setID(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
