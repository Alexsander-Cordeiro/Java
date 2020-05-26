package main;

import model.Eletrodomestico;

public class main {

	public static void main(String[] args) {
		
		Eletrodomestico eletrodomestico = new Eletrodomestico();
		
		eletrodomestico.setCor("Verde");
		eletrodomestico.setNome("Batedeira");
		eletrodomestico.setMarca("Arno");
		eletrodomestico.setNovo(true);
		
		eletrodomestico.mostrarInformacoes();

	}

}
