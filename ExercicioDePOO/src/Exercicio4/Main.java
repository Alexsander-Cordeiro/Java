package Exercicio4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
	 	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
		int numVoo=0;
		Date data = new Date();
		String horario = "";
	 	int numPassageiros=0;
	 	

	 

	 	Scanner sc = new Scanner(System.in);
	 	Scanner scTexto = new Scanner(System.in);
	 	Voo meuVoo = new Voo(numVoo,data,horario,numPassageiros);
	 	
	 
	 	for(int i=0;i < 3;i++) {
	 	System.out.println("Numero do voo: ");
	 	numVoo = sc.nextInt();
	 	meuVoo.setNumVoo(numVoo);
	 	
	 	System.out.println("Data: " + formato.format(data));

	 	
	 	System.out.println("Informe o horário: " );
	 	horario = scTexto.nextLine();
	 	meuVoo.setHorario(horario);
	 	
	 	System.out.println("Numero de passageiros: ");
	 	numPassageiros = sc.nextInt();
	 	meuVoo.setNumPassageiros(numPassageiros);
	 	
	 	meuVoo.controlePassageiros();
	 	
	
	 	meuVoo.vooCompletos();
		 	
	 	}
	 	sc.close();
	 		 	
	
	 	
	}

}
