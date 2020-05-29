package Model;

public class Preguica extends Animal implements Veterinario{
	
	public Preguica() {
		super("Flash",15);
	}

	@Override
	public void emitirSom() {
		System.out.println("A preguiça " + getNome() + " esta fazendo barulho! anhann...anhan");
		
	}
	
	public void subirArvore() {
		System.out.println("A preguiça esta subindo a árvore!");
	}
	
	@Override
	public void examinar() {
		System.out.println("A preguiça esta sendo examinado!");
		
		emitirSom();
		
	}
}
