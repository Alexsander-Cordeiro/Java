package Exercicios;

/*2- Escreva um sistema estruturado que gere os números de 1000 a
1999 e escreva
somente os números que são divisíveis por 11 e cujo resto é 5.*/

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
