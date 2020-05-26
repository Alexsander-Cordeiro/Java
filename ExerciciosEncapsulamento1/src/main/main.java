package main;

import model.Aeronave;

public class main {

	public static void main(String[] args) {
		
		Aeronave aeronave = new Aeronave();
		
		aeronave.setCor("Azul");
		aeronave.setTipo("Caça");
		
		aeronave.cor();
		aeronave.tipo();

	}

}
