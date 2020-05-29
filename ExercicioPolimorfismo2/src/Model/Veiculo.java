package Model;

import java.util.Scanner;

public class Veiculo {

	Scanner sc = new Scanner(System.in);
	
	private double peso;
	private int velocidadeMax;
	private double preco;
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	//Método Entrada de dados
	public void entradaVeiculo() {
		System.out.println("Entre com o peso do veiculo: ");
		this.peso = sc.nextDouble();
		setPeso(peso);
		System.out.println("Entre com a velocidade maxima do veiculo: ");
		this.velocidadeMax = sc.nextInt();
		setVelocidadeMax(velocidadeMax);
		System.out.println("Entre com o preço do veiculo: ");
		this.preco = sc.nextDouble();
		setPreco(preco);
		
	}
	
	//Método Mostrar os dados
	public void mostrarDados() {
		System.out.println("O Peso do veiculo é: " + getPeso()+"kg");
		System.out.println("A velocidade maxima pe: "+ getVelocidadeMax()+"Km/h");
		System.out.println("O Preço do veiculo é: R$"+ getPreco());
	}
}
