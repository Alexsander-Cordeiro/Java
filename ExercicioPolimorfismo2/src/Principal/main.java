package Principal;

import Model.Caminhao;
import Model.CarroPasseio;

public class main {

	public static void main(String[] args) {
		
		Caminhao caminhao = new Caminhao();
		CarroPasseio carro = new CarroPasseio();
		
		caminhao.entradaVeiculo();
		caminhao.entradaCaminha();
		caminhao.mostrarDados();
		caminhao.mostrarCaminhao();
		
		System.out.println("\n---------------------------\n");
		
		carro.entradaVeiculo();
		carro.entradaPass();
		carro.mostrarDados();
		carro.mostrarPass();

	}

}
