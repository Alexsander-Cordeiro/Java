package model;

public class Moto extends Veiculo{
	
	private String cor;
	private boolean completo;
	private String modelo;
	private boolean seguro;
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isCompleto() {
		return completo;
	}
	public void setCompleto(boolean completo) {
		this.completo = completo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isSeguro() {
		return seguro;
	}
	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}
	
	//Método
	
		public void imprimirNotaFiscal() {
			System.out.println("Moto Comprado!!");
			System.out.println("Marca: " + getMarca());
			System.out.println("Modelo: " + this.modelo);
			System.out.println("Cor: " + this.cor);
			System.out.println("Combustivel: " + getCombustivel());
			System.out.println("Novo: " + isUsado());
			System.out.println("Carro completo: " + this.completo);
			System.out.println("Tem seguro: "+ this.seguro);
		}

}
