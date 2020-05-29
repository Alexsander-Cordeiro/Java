package Principal;

import Model.Cachorro;
import Model.Cavalo;
import Model.Preguica;

public class Main {

	public static void main(String[] args) {
		
		Cavalo animal1 = new Cavalo();
		animal1.correr();
		animal1.examinar();
		
		System.out.println("-----------------");
		
		Cachorro animal2 = new Cachorro();
		animal2.correr();
		animal2.examinar();
		
		System.out.println("-----------------------");
		
		Preguica animal3 = new Preguica();
		animal3.subirArvore();
		animal3.examinar();
	}

}
