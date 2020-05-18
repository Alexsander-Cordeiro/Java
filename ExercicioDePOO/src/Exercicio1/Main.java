package Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nome="";
		String email="";
		String telefone="";
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa meusDados = new Pessoa(nome,email,telefone);
		
		System.out.println("Informe o nome: ");
		nome = sc.nextLine();
		meusDados.setNome(nome);
		
		System.out.println("Informe o email: ");
		email = sc.nextLine();
		meusDados.setEmail(email);
		
		System.out.println("Informe o telefone: ");
		telefone = sc.nextLine();
		meusDados.setTelefone(telefone);
		
		//Usando o método
		meusDados.CartãoDeVisita();
		
		
		sc.close();

	}

}
