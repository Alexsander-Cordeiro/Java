package Exercicios;

/*4- Ler
o nome de um aluno e as suas duas notas A e B, e após calcular a média
ponderada entre estas notas (A tem peso 1 e B tem peso 2). Verifique se a
nota digitada é valida, caso seja inválida, repita a leitura. Repetir este
procedimento para uma turma composta por cinco alunos, usando o comando
While .
Exemplo de tela de saída: Entre com o
nome do aluno: Fulano da Silva Entre com
o grau A: 5.0 Entre com o grau B: 6.0 O
aluno Fulano da Silva tem uma media: 5.66
Entre com o nome do aluno: Ciclano da
Silva Entre com o grau A: 12.5 Nota
invalida! Entre com o grau A: 2.5 ...*/

import java.util.Scanner;

public class Ex4 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Scanner scNome = new Scanner(System.in);
		
		
		 float media = 0,nota1,nota2;
		 String nome;
		 int i =0;
		
		 
		while(i <= 5) {
				
		 
		 System.out.printf("Entre com o nome do aluno: ");
		 nome = scNome.next();
		 
		
		 System.out.print("Entre com a nota A: ");
		 nota1 = sc.nextFloat();
		 
		 if(nota1 > 10 || nota1 < 0) {
			 System.out.println("Nota Inválida");
			 
			 do {
				 System.out.print("Entre com a nota A novamente: ");
				 nota1 = sc.nextFloat();
			 }while(nota1 > 10 || nota1 <0);
		 }
		 
			 System.out.print("Entre com a nota B: ");
			 nota2 = sc.nextFloat();
			 
			 if(nota2 > 10 || nota2 < 0) {
				 System.out.print("Nota Inválida");
				 
				 do {
					 System.out.println("Entre com a nota B novamente: ");
					 nota2 = sc.nextFloat();
				 }while(nota2 > 10);
			 }
			 
			 	media = (nota1 + nota2*2) /3;
			 	System.out.println("O aluno " + nome + " tem a média " + media);
			 	i++;
			 	System.out.println();
		 
		 }
			sc.close();
			scNome.close();
		 
	}
	
	
		 
}


