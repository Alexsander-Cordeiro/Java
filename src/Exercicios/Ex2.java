package Exercicios;

/*2- Escreva um sistema estruturado que gere os n�meros de 1000 a
1999 e escreva
somente os n�meros que s�o divis�veis por 11 e cujo resto � 5.*/

public class Ex2 {
	public static void main(String args[]) {
		
		int resultado = 0;
		
		for(int i=1000;i<=1999;i++) {
			if(i%11 == 0 || i%2 == 5) {
				resultado = resultado + i;
				System.out.println(i);
			}
			
		}
	}
}
