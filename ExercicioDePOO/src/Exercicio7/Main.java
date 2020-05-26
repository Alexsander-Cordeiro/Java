package Exercicio7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double largura =0,altura=0;
		boolean estaAberta = false;
		
		Janela janela = new Janela(largura,altura,estaAberta);
		
		System.out.println("Informe a Largura: ");
		largura = sc.nextDouble();
		janela.setLargura(largura);
		
		System.out.println("Informe a altura: ");
		altura = sc.nextDouble();
		janela.setAltura(altura);
		
		
		//executando
		janela.abrir();
		
		janela.fechar();
		
		janela.estaAberta();
		
		janela.abrir();
		janela.abrir();
		
		sc.close();

	}

}
