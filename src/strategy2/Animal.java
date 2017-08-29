package strategy2;

public class Animal {
	
	private String nome;
	private double speed;
	private String sound;
	
	// Exemplo de composição aqui também
		public Flys flyingType;
		
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSpeed() {
		return speed;
	}



	public void setSpeed(double speed) {
		this.speed = speed;
	}



	public String getSound() {
		return sound;
	}



	public void setSound(String sound) {
		this.sound = sound;
	}

	public String tryToFly() {
		return flyingType.fly();
	}

	
	
}
