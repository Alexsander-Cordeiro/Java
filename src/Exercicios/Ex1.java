package Exercicios;

/*1- Desenvolver um sistema que efetue a soma de todos os n�meros �mpares
que s�o m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1
at� 500.*/


public class Ex1 {
	public static void main(String args[]) {
		
		int somaImpar=0;
				
		System.out.println("Os numeros impares s�o: ");
		for(int i= 1;i <= 500;i++) {
			
				
			if(i%2 != 0 && i%3 == 0) {
				somaImpar = somaImpar + i;
				System.out.println(i);
				
			}else {
				
			}
			
		}
	
		
	}

}
