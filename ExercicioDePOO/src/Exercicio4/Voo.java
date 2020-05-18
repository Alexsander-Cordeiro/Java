package Exercicio4;

import java.util.Date;

/*4-Criar uma classe Voo que tem os seguintes atributos: n�mero do v�o,
data, hor�rio e n�mero de passageiros.
Implementar um m�todo para controlar o n�mero de passageiros por v�o,
considerando que para cada v�o o n�mero m�ximo s�o 50 passageiros.
Imprimir os v�os que est�o completos (com 50 passageiros).
 */
//SimpleDateFormat formataData= new SimpleDateFormat("dd/MM/yyyy");

public class Voo {
	
	private int numVoo;
	private Date data;
	private String horario;
	private int numPassageiros;
	
	//Construtor
	
	public Voo(int numVoo,Date data,String horario,int numPassageiros) {
		this.numVoo = numVoo;
		this.data = data;
		this.horario = horario;
		this.numPassageiros = numPassageiros;
		
	}

	public int getNumVoo() {
		return numVoo;
	}

	public void setNumVoo(int numVoo) {
		this.numVoo = numVoo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	
	//M�todo de controlar o numero de passageiros
	
	public void controlePassageiros() {
		if(getNumPassageiros() >= 50) {
			System.out.println("Avi�o ja esta lotado!!");
						
		}else {
			System.out.println("Ainda tem assentos disponiveis");
		}
	}
	
	public void vooCompletos() {
		int vooCompleto = 0;
		if(getNumPassageiros() >= 50) {
			vooCompleto++;
			System.out.println("Os Voos lotados s�o: "+ vooCompleto);
		}
	}
	
	

}
