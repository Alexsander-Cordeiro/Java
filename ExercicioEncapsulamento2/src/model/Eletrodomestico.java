package model;

public class Eletrodomestico {
	
	private String nome;
	private String marca;
	private String cor;
	private boolean novo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isNovo() {
		return novo;
	}
	public void setNovo(boolean novo) {
		this.novo = novo;
	}
	
	
	//Métodos
	public void mostrarInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Novo: " + this.novo);
	}

}
