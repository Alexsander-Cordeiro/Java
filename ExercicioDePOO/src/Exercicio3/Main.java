package Exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String numAgencia="";
		int numConta=0;
		float saldoConta= 100;
		String operacao="";
		float valor=0;
		
		Scanner sc = new Scanner(System.in);
		
		ContaCorrente conta = new ContaCorrente(numAgencia,numConta,
				saldoConta,operacao,valor);
		
		System.out.println("Informe sua agência: ");
		numAgencia = sc.nextLine();
		conta.setNumAgencia(numAgencia);
		
		System.out.println("Informe numero da conta: ");
		numConta = sc.nextInt();
		conta.setNumConta(numConta);
		
		System.out.println("Informe s-saque e d-depósito: ");
		operacao = sc.next();
		conta.setOperacao(operacao);
		
		
		
		//executando
		if(operacao.equals("d")) {
		System.out.println("Informe o valor do depósito: ");
		valor = sc.nextFloat();
		conta.setValor(valor);
		
		conta.deposito();
		conta.getSaldoConta();
		}
		
		else if(operacao.equals("s")) {
		System.out.println("Informe o valor de saque: ");
		valor = sc.nextFloat();
		conta.setValor(valor);
		conta.saque();
		conta.getSaldoConta();
		

		}
			
		System.out.println();
		//atualizando o saldo da conta
		System.out.println("Agência: " + numAgencia);
		System.out.println("Conta: " + numConta);
		System.out.println("Saldo atual é: "+ conta.saldoAtual());
		
		
		sc.close();

	}

}
