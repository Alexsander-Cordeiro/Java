package model;

public class Aeronave {
	
	private String cor;
	private String tipo;
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//M�todos
	public void tipo() {
		System.out.println("O tipo da aeronave �: " + this.tipo);
		
	}
	
	public void cor() {
		System.out.println("A Cor da aeronave �: " + this.cor);
		
	}
	

}
