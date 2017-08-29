package composicao2;

public class Casa {

	private Quarto quarto;
	private Sala sala;
	private Cozinha cozinha;
	private Banheiro banheiro;
	public Casa(Quarto quarto, Sala sala, Cozinha cozinha, Banheiro banheiro) {
		super();
		this.quarto = quarto;
		this.sala = sala;
		this.cozinha = cozinha;
		this.banheiro = banheiro;
	}
	public Quarto getQuarto() {
		return quarto;
	}
	public Sala getSala() {
		return sala;
	}
	public Cozinha getCozinha() {
		return cozinha;
	}
	public Banheiro getBanheiro() {
		return banheiro;
	}
	
	
}
