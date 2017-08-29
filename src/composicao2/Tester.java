package composicao2;

public class Tester {

	public static void main(String[] args) {
		
		Janela janela = new Janela(40, 20);
		Porta porta = new Porta(100, 20, "wood");
		
		
		Banheiro banheiro = new Banheiro(janela, porta, new DimensaoComodos(400, 100));
		Cozinha cozinha = new Cozinha(janela, porta, new DimensaoComodos(300, 50));
		Quarto quarto = new Quarto(janela, porta, new DimensaoComodos(400, 200));
		Sala sala = new Sala(janela, porta, new DimensaoComodos(700, 300));
		
		Casa casa1 = new Casa(quarto, sala, cozinha, banheiro);
		
		

	}

}
