package Exercicios;

import java.util.Scanner;

/*7- Escrever um sistema que lê um valor N inteiro e positivo e que calcula e
escreve o valor de E. E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!*/

public class Ex7 {
	public static void main(String args[]) {
		
			Scanner sc = new Scanner(System.in);
			
			int i = 0, num;
			double fat = 0, res = 0;
			
			System.out.println("Informe um número inteiro: ");
			num = sc.nextInt();
			
			while(i<=num) {
				if(i==0) {
					res+=1;
					fat = 1;
				}else {
					fat*=i;
					res+=(1/fat);
				}
				i++;
			}
			System.out.println("E = "+res);
			
			sc.close();

	}	
}
