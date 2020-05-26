package Exercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num1=0,num2=0;
		
		Scanner sc= new Scanner(System.in);
		
		Operacoes op = new Operacoes(num1,num2);
		
		System.out.println("Informe o numero 1: ");
		num1= sc.nextInt();
		op.setNum1(num1);
		
		System.out.println("Informe o numero 2: ");
		num2 = sc.nextInt();
		op.setNum2(num2);
		
		//executando os métodos
		op.soma();
		op.subtrair();
		op.multiplicacao();
		op.dividir();
		op.potencia();
		
		
		
		sc.close();

	}

}
