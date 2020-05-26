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
	
	
	//M�todo soma
	public void soma() {
		int resultado = 0;
		
		resultado = getNum1()+getNum2();
		
		System.out.println("A soma dos numeros �: "+resultado);
		
	}
	
	//M�todo subtrair
	public void subtrair() {
		int resultado = 0;
		
		resultado = getNum1()-getNum2();
		
		System.out.println("A subtra��o dos numeros �: "+resultado);
		
	}
	
	//M�todo dividir
		public void dividir() {
			int resultado = 0;
			if(num2 != 0) {
			resultado = getNum1()/getNum2();
			
			System.out.println("A divis�o dos numeros �: "+resultado);
			}else {
				System.out.println("0 n�o � divis�vel");
			}
		}
		
	//M�todo multiplicar
		public void multiplicacao() {
			int resultado = 0;
			
			resultado = getNum1()*getNum2();
			
			System.out.println("A multiplica��o dos numeros �: "+resultado);
			
		}
	//M�todo pontecia
		public void potencia() {
			double resultado = 0;
					
			resultado = Math.pow(getNum1(), getNum2());
					
			System.out.println("A pont�ncia dos numeros �: "+resultado);
					
		}	
	
}
