package Exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nome="";
		int dataNasc = 0;
		
		Scanner sc =  new Scanner(System.in);
		
		Pessoa minhaIdade = new Pessoa(nome,dataNasc);
		
		System.out.println("Inform o nome: ");
		nome = sc.nextLine();
		minhaIdade.setNome(nome);
		
		System.out.println("Informe a ano de nascimento: ");
		dataNasc = sc.nextInt();
		minhaIdade.setDataNasc(dataNasc);
		
		//executando o metodo
		minhaIdade.calcularIdade();
		
		minhaIdade.calcularIdade50();
		
		
		sc.close();
	}

}
