package Exercicios;

/*6- Uma empresa desenvolveu uma
pesquisa para saber as características psicológicas dos indivíduos de uma
região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo
(1-feminino / 2-masculino), e as opções (1, se a pessoa era calma; 2, se a
pessoa era nervosa e 3, se a pessoa era agressiva). Pede- se para elaborar
um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
• o número de pessoas calmas;
• o número de mulheres nervosas;
• o número de homens agressivos;
• o número de pessoas nervosas com mais de 40
anos;
• o número de pessoas calmas com menos de 18
anos.*/

import java.util.Scanner;

public class Ex6 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		char sexo;
		int idade,calma=0, mulheresNervosas=0,nervosas40=0,
			homensAgressivos=0,temperamento,menoresCalmos=0;
		
		for(int i=0;i <= 2;i++) {
			
			System.out.println("Informe a idade: ");
			idade = sc.nextInt();
			
			System.out.println("Informe o sexo, '1' para Feminino/'2' para masculino: ");
			sexo = sc.next().charAt(0);
			
			System.out.println("Temperamentos: '1' Calma/ '2' Nervosa/ '3' Agressiva: ");
			temperamento = sc.nextInt();
			
			if(temperamento == 1) {
				calma = calma + 1;
			}
			if(sexo == 1 && temperamento == 2) {
				mulheresNervosas = mulheresNervosas + 1;
			}
			if(sexo == 2 && temperamento == 3) {
				homensAgressivos = homensAgressivos + 1;
			}
			if(temperamento == 2 && idade > 39) {
				nervosas40 = nervosas40 + 1;
			}
			if(temperamento == 1 && idade <= 18) {
				menoresCalmos = menoresCalmos + 1;
			}
			
		}
		
		System.out.println("o número de pessoas calmas: " + calma);
		System.out.println("o número de mulheres nervosas: "+ mulheresNervosas);
		System.out.println("o número de homens agressivos: " + homensAgressivos);
		System.out.println("o número de pessoas nervosas com mais de 40 anos: " + nervosas40);
		System.out.println("o número de pessoas calmas com menos de 18 anos: " + menoresCalmos);
		
		sc.close();
	}
}
