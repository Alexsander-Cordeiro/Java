package Model;

import java.util.Scanner;

public class CarroPasseio extends Veiculo{
	
	private String cor;
	private String modelo;
	
	Scanner sc= new Scanner(System.in);
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//m�todos de entrada
	public void entradaPass() {
		System.out.println("Entre com a cor: ");
		this.cor = sc.nextLine();
		setCor(cor);
		System.out.println("Entre com o modelo: ");
		this.modelo = sc.nextLine();
		setModelo(modelo);
		
	}
	
	//m�todo mostrar dados
	public void mostrarPass() {
		System.out.println("A cor �: "+getCor());
		System.out.println("O modelo �: "+getModelo());
	}
	

}
