package Exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numAgencia=0;
		int numConta=0;
		float saldoConta= 100;
		String operacao="";
		float valor=0;
		
		Scanner sc = new Scanner(System.in);
		
		ContaCorrente conta = new ContaCorrente(numAgencia,numConta,
				saldoConta,operacao,valor);
		
		System.out.println("Informe sua agência: ");
		numAgencia = sc.nextInt();
		conta.setNumAgencia(numAgencia);
		
		System.out.println("Informe numero da conta: ");
		numConta = sc.nextInt();
		conta.setNumConta(numConta);
		
		
		
		//executando
		System.out.println("Informe o valor do depósito: ");
		valor = sc.nextFloat();
		conta.setValor(valor);
		
		conta.deposito();
		conta.getSaldoConta();
		
		
		System.out.println("Informe o valor de saque: ");
		valor = sc.nextFloat();
		conta.setValor(valor);
		conta.saque();
		conta.getSaldoConta();
		
		System.out.println();
		
		//atualizando o saldo da conta
		System.out.println("Agência: " + numAgencia);
		System.out.println("Conta: " + numConta);
		System.out.println("Saldo atual é: "+ conta.saldoAtual());
		
		
		sc.close();

	}

}
