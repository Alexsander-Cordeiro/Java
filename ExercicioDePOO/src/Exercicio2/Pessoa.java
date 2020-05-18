package Exercicio2;



/*2-Criar uma classe Pessoa com os seguintes atributos: nome e ano de nascimento.
Implemente os seguintes m�todos:  M�todo para calcular a idade da pessoa. 
M�todo para calcular a idade da pessoa daqui 50 anos.
*/

public class Pessoa {
	
	private String nome;
	private int dataNasc;
	
	//Construtor
	
	public Pessoa(String nome,int dataNasc) {
		this.nome = nome;
		this.dataNasc = dataNasc;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(int dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	//M�todo para calcular a idade
	public void calcularIdade() {
		int resultado = 0;
		int anoAtual = 2020;
		
		resultado = anoAtual - getDataNasc();
		System.out.println("A idade �: " +resultado);
	}	
	//M�todo para calcular idade daqui 50 anos
		
	public void calcularIdade50() {
		int resultado = 0;
		
		resultado = 2070 - getDataNasc();
		
		System.out.println("A idade daqui 50 anos �: " + resultado);
		
			
	}
	


}
