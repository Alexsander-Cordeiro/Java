package Exercicios;

import java.util.Scanner;

/*8- A prefeitura de uma cidade
fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e
número de filhos. A prefeitura deseja saber:
a) média do salário da
população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até
R$100,00.*/

public class Ex8 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		
		float salario=0,maiorSalario=0;
		int numeroFilhos=0,percentual=0,mediaSalario=0,mediaNumeroFilhos=0;
		
		for(int i =1;i <= 20;i++) {
			System.out.println("Habitante nº "+ i);
			System.out.println("Digite o salário: ");
			salario = sc.nextFloat();
			System.out.println("Digite o numero de filhos: ");
			numeroFilhos = sc.nextInt();
			
					
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}
			
			if(salario < 100) {
				percentual = percentual + 1;
			}
						
			mediaSalario += salario;
			mediaNumeroFilhos += numeroFilhos;
		}
		
		sc.close();		
		mediaSalario = mediaSalario / 20;
		mediaNumeroFilhos = mediaNumeroFilhos/20;
		percentual = (percentual*100)/20;
		
		System.out.println("A média de Salário da população é: "+ mediaSalario);
		System.out.println("A média de filhos da população é: "+ mediaNumeroFilhos);
		System.out.println("O maior Salário é: "+ maiorSalario);
		System.out.println("Percentual de pessoas com salário menor que R$ 100,00: "+ percentual+"%");
	}

}
