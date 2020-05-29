package Model;

import java.util.Scanner;

public class Caminhao extends Veiculo{
	
	private double toneladas;
	private int alturaMax;
	private int comprimento;
	
	Scanner sc = new Scanner(System.in);
	
	
	public double getToneladas() {
		return toneladas;
	}
	public void setToneladas(double toneladas) {
		this.toneladas = toneladas;
	}
	public int getAltura() {
		return alturaMax;
	}
	public void setAltura(int alturaMax) {
		this.alturaMax = alturaMax;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	//método entradas de dados
	public void entradaCaminha() {
		System.out.println("Entre com a tonelada: ");
		this.toneladas = sc.nextDouble();
		setToneladas(toneladas);
		System.out.println("Entre com a altura maxima: ");
		this.alturaMax = sc.nextInt();
		setAltura(alturaMax);
		System.out.println("Entre com o comprimento: ");
		this.comprimento = sc.nextInt();
		setComprimento(comprimento);
		
	}
	
	//Método mostrar dados
	public void mostrarCaminhao() {
		System.out.println("A toneladas é: " + getToneladas());
		System.out.println("A altura maxima é: "+getAltura());
		System.out.println("O comprimento é: " + getComprimento());
		
	}

}
