package model;

public class Veiculo {
	

	private String combustivel;
	private String marca;
	private boolean usado;
	private int velocidade=0;

	
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isUsado() {
		return usado;
	}
	public void setUsado(boolean usado) {
		this.usado = usado;
	}
	
	//Metodos
	
	public void comprar() {
		
		System.out.println("Marca: " + this.marca);
		System.out.println("Combustível: "+this.combustivel);
		System.out.println("Usado: "+ this.usado);
	}
	

	
	public void acelerar() {
		
		for(this.velocidade=0;this.velocidade < 120 ; this.velocidade++) {
			this.velocidade = this.velocidade + 1;
			System.out.println("Acelerando: "+ this.velocidade + "Km/h");
		}
	}
	
	public void freiar() {
		
		int freiar=0;
		
		if(this.velocidade != 0) {
			
			for(freiar = 1;freiar > 0; this.velocidade--) {
				freiar = this.velocidade;
				System.out.println("freiando: "+ freiar + "Km/h");
			}
				
		}else {
			System.out.println("O carro esta parado!!");
		}
	}
	
	public void curva() {
		if(this.velocidade > 0) {
			System.out.println("Fazendo a CURVA!!");
		}else {
			System.out.println("Carro parado!!");
		}
	}
	
	public void capotamento() {
		this.curva();
	
			if(this.velocidade >= 70) {
				System.out.println("Carro capotou!!!");
				
			}else if(this.velocidade > 0 && this.velocidade < 70 ) {
				System.out.println("Curva feita com sucesso!!");
			}else {
				System.out.println("Estacionado!!");
			}
		
	}

}
