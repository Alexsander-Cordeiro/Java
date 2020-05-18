package Exercicio4;

import java.util.Date;

/*4-Criar uma classe Voo que tem os seguintes atributos: número do vôo,
data, horário e número de passageiros.
Implementar um método para controlar o número de passageiros por vôo,
considerando que para cada vôo o número máximo são 50 passageiros.
Imprimir os vôos que estão completos (com 50 passageiros).
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
	
	//Método de controlar o numero de passageiros
	
	public void controlePassageiros() {
		if(getNumPassageiros() >= 50) {
			System.out.println("Avião ja esta lotado!!");
						
		}else {
			System.out.println("Ainda tem assentos disponiveis");
		}
	}
	
	public void vooCompletos() {
		int vooCompleto = 0;
		if(getNumPassageiros() >= 50) {
			vooCompleto++;
			System.out.println("Os Voos lotados são: "+ vooCompleto);
		}
	}
	
	

}
