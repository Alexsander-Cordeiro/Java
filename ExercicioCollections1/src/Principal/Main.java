package Principal;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Telefone;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Scanner scTipo = new Scanner(System.in);
		Telefone telefone = new Telefone();
		
		
		
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<Integer> listaTipo = new ArrayList<Integer>();
		
		
		
		for(int i=0; i < 3; i++) {
					
		
				System.out.println("Infome o numero de telefone: ");
				String numTelefone = sc.nextLine();
				telefone.setNumTelefone(numTelefone);
			
				System.out.println("Infome 1- telefone fixo e 2- telefone móvel ");
				int tipoTelefone = scTipo.nextInt();
				telefone.setTipoTelefone(tipoTelefone);
				
				lista.add(numTelefone);
				listaTipo.add(tipoTelefone);
				
				
		}
		
		System.out.println("Lista: " + lista);
		System.out.println("Tipo: " + listaTipo);
		
		System.out.println("-------------------------------");
		
		for(int i=1; i < lista.size(); i++) {
			System.out.println("Telefone #"+i);
			System.out.println(lista.get(i) + "\n" +
									listaTipo.get(i));
				System.out.println();
			}
		}
		
		
		
		

	}


