package Model;

public class Cavalo extends Animal implements Veterinario{

	public Cavalo() {
		super("Pocotó",10);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O Animal "+ getNome() + " esta fazendo barulho!! Vrum...Vrum...");
		
	}
	
	public void correr() {
		System.out.println("O cavalo tem a idade de " + getIdade() + " anos e esta correndo muito bem!!");
	}
	
	@Override
	public void examinar() {
		System.out.println("O cavalo esta sendo examinado!");
		
		emitirSom();
		
	}
}
