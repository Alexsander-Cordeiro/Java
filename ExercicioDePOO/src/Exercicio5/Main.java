package Exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String id="";
		String nome="";
		String sobrenome = "";
		float salarioAtual=0;
		
		Empregados emp = new Empregados(id,nome,sobrenome,salarioAtual);
		
		
		System.out.println("Informe o seu nome: ");
		nome = sc.nextLine();
		emp.setNome(nome);
		
		System.out.println("Informe o sobrenome: ");
		sobrenome = sc.nextLine();
		emp.setSobrenome(sobrenome);
		
		System.out.println("Informe seu salário: ");
		salarioAtual = sc.nextFloat();
		emp.setSalarioAtual(salarioAtual);
		
		
		//Executando os métodos
		emp.exibirDados();
		System.out.println();
		
		emp.aumentoSalario();
		System.out.println();
		
		emp.entrarComAumento();
		
		

	}

}
