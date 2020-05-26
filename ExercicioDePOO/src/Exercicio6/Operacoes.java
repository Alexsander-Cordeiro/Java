package Exercicio6;

public class Operacoes {

	private int num1;
	private int num2;
	
	//Construtor
	
	public Operacoes(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	//Método soma
	public void soma() {
		int resultado = 0;
		
		resultado = getNum1()+getNum2();
		
		System.out.println("A soma dos numeros é: "+resultado);
		
	}
	
	//Método subtrair
	public void subtrair() {
		int resultado = 0;
		
		resultado = getNum1()-getNum2();
		
		System.out.println("A subtração dos numeros é: "+resultado);
		
	}
	
	//Método dividir
		public void dividir() {
			int resultado = 0;
			if(num2 != 0) {
			resultado = getNum1()/getNum2();
			
			System.out.println("A divisão dos numeros é: "+resultado);
			}else {
				System.out.println("0 não é divisível");
			}
		}
		
	//Método multiplicar
		public void multiplicacao() {
			int resultado = 0;
			
			resultado = getNum1()*getNum2();
			
			System.out.println("A multiplicação dos numeros é: "+resultado);
			
		}
	//Método pontecia
		public void potencia() {
			double resultado = 0;
					
			resultado = Math.pow(getNum1(), getNum2());
					
			System.out.println("A pontência dos numeros é: "+resultado);
					
		}	
	
}
