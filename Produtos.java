package br.com.exercicios;

public class Produtos {

	private String nomeProduto;
	private String categoria;
	private int qtdEstoque;
	
	public Produtos(String nomeProduto, String categoria, int qtdEstoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.categoria = categoria;
		this.qtdEstoque = qtdEstoque;
	}
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public void adiconarProduto(String nome, String categoria, int qtdEstoque){
		
	}
	
	public void removerProduto(String nome) {
		
	}
}
