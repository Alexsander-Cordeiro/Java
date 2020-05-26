package Exercicio5;

import java.util.Scanner;

public class Empregados {
	
	private String id;
	private String nome;
	private String sobrenome;
	private float salarioAtual;
	
	//Construtor
	public Empregados(String id,String nome,String sobrenome,float salarioAtual) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioAtual = salarioAtual;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getSalarioAtual() {
		return salarioAtual;
	}

	public void setSalarioAtual(float salarioAtual) {
		this.salarioAtual = salarioAtual;
	}
	
	//Método exibir o nome completo e o salário
	public void exibirDados() {
		System.out.println("Nome Completo: "+ getNome()+" "+getSobrenome());
		System.out.println("Salário atual: "+ getSalarioAtual());
	}
	
	//Método para aumento de salário
	public void aumentoSalario() {
		float aumento=0;
		
		aumento = (getSalarioAtual()/100)*20; 
		salarioAtual = getSalarioAtual()+ aumento;
		
		System.out.println("Nome Completo: "+ getNome()+" "+getSobrenome());
		System.out.println("Salário atual pós aumento é: "+ salarioAtual);
	}
	
	//Método aumento salario conforme a entrada
	public void entrarComAumento() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor do indice: ");
		int indice = sc.nextInt();
		float aumento = 0;
		
		aumento = (salarioAtual /100)*indice; 
		
		salarioAtual = salarioAtual + aumento;
		
		System.out.println("Nome Completo: "+ getNome()+" "+getSobrenome());
		System.out.println("O percentual do aumento é de : "+ indice+"%");
		System.out.println("Salário atual pós aumento é: "+ salarioAtual);
		
		sc.close();
	}
	
	
	
}
