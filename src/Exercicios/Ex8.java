package Exercicios;

import java.util.Scanner;

/*8- A prefeitura de uma cidade
fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e
n�mero de filhos. A prefeitura deseja saber:
a) m�dia do sal�rio da
popula��o;
b) m�dia do n�mero de filhos;
c) maior sal�rio;
d) percentual de pessoas com sal�rio at�
R$100,00.*/

public class Ex8 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		
		float salario=0,maiorSalario=0;
		int numeroFilhos=0,percentual=0,mediaSalario=0,mediaNumeroFilhos=0;
		
		for(int i =1;i <= 20;i++) {
			System.out.println("Habitante n� "+ i);
			System.out.println("Digite o sal�rio: ");
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
		
		System.out.println("A m�dia de Sal�rio da popula��o �: "+ mediaSalario);
		System.out.println("A m�dia de filhos da popula��o �: "+ mediaNumeroFilhos);
		System.out.println("O maior Sal�rio �: "+ maiorSalario);
		System.out.println("Percentual de pessoas com sal�rio menor que R$ 100,00: "+ percentual+"%");
	}

}
