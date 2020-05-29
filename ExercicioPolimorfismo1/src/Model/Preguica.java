package Model;

public class Preguica extends Animal implements Veterinario{
	
	public Preguica() {
		super("Flash",15);
	}

	@Override
	public void emitirSom() {
		System.out.println("A pregui�a " + getNome() + " esta fazendo barulho! anhann...anhan");
		
	}
	
	public void subirArvore() {
		System.out.println("A pregui�a esta subindo a �rvore!");
	}
	
	@Override
	public void examinar() {
		System.out.println("A pregui�a esta sendo examinado!");
		
		emitirSom();
		
	}
}
