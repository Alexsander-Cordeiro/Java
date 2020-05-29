package Principal;

import java.util.ArrayList;


public class TestandoListas {

    public static void main(String[] args) {

	        String aula1 = "Modelando a classe Aula";
	        String aula2 = "Conhecendo mais de listas";
	        String aula3 = "Trabalhando com Cursos e Sets";

	        ArrayList<String> aulas = new ArrayList<String>();
	        aulas.add(aula1);
	        aulas.add(aula2);	//O objeto aulas esta adicionando na lista as variáveis de String aula
	        aulas.add(aula3);        

	        System.out.println(aulas); // Sera exibido na ordem ascendente
	        System.out.println(aulas.size()); //Esta exibindo a quantidade de itens na lista

	      
	        for (int i = 0; i < aulas.size(); i++) {	//percorrendo até que a lista for menor que a 
	            System.out.println("Aula: " + aulas.get(i)); //quantidade total de itens na lista
	        }
	    }
	}
