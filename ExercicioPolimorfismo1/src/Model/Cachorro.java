package Model;

public class Cachorro extends Animal implements Veterinario{
	
	public Cachorro() {
		super("Thor", 5);
	}
	
	
	@Override
	public void emitirSom() {
		System.out.println("O Animal " + this.getNome()+ " esta latindo!! auau..auau...");
		
	}
	
	public void correr() {
		System.out.println("O cachorro " +getNome() +" esta correndo!!");
	}
	
	@Override
	public void examinar() {
		System.out.println("O cachorro esta sendo examinado!");
		
		emitirSom();
		
	}

}
