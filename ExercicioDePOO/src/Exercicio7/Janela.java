package Exercicio7;

public class Janela {
	
	private double largura;
	private double altura;
	private boolean estaAberta;
	
	//Construtor
	public Janela(double largura,double altura,boolean estaAberta) {
		this.largura = largura;
		this.altura = altura;
		this.estaAberta = estaAberta;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isEstaAberta() {
		return estaAberta;
	}

	public void setEstaAberta(boolean estaAberta) {
		this.estaAberta = estaAberta;
	}
	
	
	//Método abrir
	public void abrir() {
		if(isEstaAberta() == false) {	
			System.out.println("Largura: "+ getLargura());
			System.out.println("Largura: "+ getAltura());
			System.out.println("Abrindo janela!!!!");
			estaAberta = true;
		}else {
			System.out.println("Janela esta fechada!!!!");
			estaAberta = false;
		}
	}
	
	//Método fechar
	public void fechar() {
		if(estaAberta == false) {
			estaAberta = false;
			System.out.println("Janela ja esta fechada!!");
		}else {
			
			System.out.println("Largura: "+ getLargura());
			System.out.println("Largura: "+ getAltura());
			System.out.println("Fechando a janela!!!");
			estaAberta = true;
		}
	}
	
	public void estaAberta() {
		if(estaAberta == true) {
			System.out.println("Largura: "+ getLargura());
			System.out.println("Largura: "+ getAltura());
			estaAberta = false;
			System.out.println("Esta fechada a janela!");
		}else {
			System.out.println("Esta fechada a janela!");
			estaAberta = false;
		}
	}
	

}
