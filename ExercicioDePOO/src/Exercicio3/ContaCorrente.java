package Exercicio3;

/*3-Criar uma classe Conta Corrente com os seguintes atributos: número da agência,
número da conta, saldo atual, operação (depósito ou saque) e valor.
Implementar os seguintes métodos:
Método para depósito.
Método para saque.
Método para imprimir o saldo atual.
*/

public class ContaCorrente {
	
	private int numAgencia;
	private int numConta;
	private float saldoConta;
	private String operacao;
	private float valor;
	
	//Construtor
	
	public ContaCorrente(int numAgencia,int numConta,
			float saldoConta,String operacao,float valor) {
		
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldoConta = saldoConta;
		this.operacao = operacao;
		this.valor = valor;
	}

	public int getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public float getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(float saldoConta) {
		this.saldoConta = saldoConta;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	//Método de depósito
	public void deposito() {
		saldoConta = getSaldoConta() + getValor();
		System.out.println("Saldo atual é: " + getSaldoConta());
	}
	
	//Método para saque
	public void saque() {
		saldoConta = getSaldoConta() - getValor();
		System.out.println("Saldo atual é: " + getSaldoConta());
	}
	
	//Método para imprimir saldo atual
	public float saldoAtual() {
		return getSaldoConta();
	}
	
}
