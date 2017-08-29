package composicao2;

public class Sala {

	private Janela janela;
	private Porta porta;
	private DimensaoComodos dimensaoComodos;
	public Sala(Janela janela, Porta porta, DimensaoComodos dimensaoComodos) {
		super();
		this.janela = janela;
		this.porta = porta;
		this.dimensaoComodos = dimensaoComodos;
	}
	public Janela getJanela() {
		return janela;
	}
	public Porta getPorta() {
		return porta;
	}
	public DimensaoComodos getDimensaoComodos() {
		return dimensaoComodos;
	}
}
