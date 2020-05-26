package main;

import model.Carro;
import model.Moto;

public class main {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
	
		carro.setMarca("Nissan");
		carro.setCor("Preto");
		carro.setModelo("Versa");
		carro.setCombustivel("Flex");
		carro.setSeguro(false);
		carro.setCompleto(true);
		carro.setUsado(true);
		
		//executando método
		
		carro.comprar();
		
		System.out.println();
		
		carro.imprimirNotaFiscal();
		
		System.out.println();
		
		//acelerando
		carro.acelerar();
		
		System.out.println();
		
		//freiando		
		carro.freiar();
		
		System.out.println();
		
		carro.capotamento();
		
		System.out.println("\n--------------------------\n");
		
		Moto moto = new Moto();
		
		moto.setMarca("Honda");
		moto.setCor("Preto");
		moto.setModelo("Bis");
		moto.setCombustivel("Gasolina");
		moto.setSeguro(false);
		moto.setCompleto(true);
		moto.setUsado(true);
		
		
		//executando
		moto.comprar();
		
		System.out.println();
		
		moto.imprimirNotaFiscal();
		
		//acelerando
		moto.acelerar();
		
		System.out.println();
		
			
		moto.capotamento();
		
		
	}

}
