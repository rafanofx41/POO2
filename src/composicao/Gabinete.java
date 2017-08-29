package composicao;

public class Gabinete {
	
	private String model;
	
	/* Exemplo de composição, o gabinete tem dimensões*/
	private Dimensions dimensions;
	public Gabinete(String model, Dimensions dimensions) {
		super();
		this.model = model;
		this.dimensions = dimensions;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}

	public String getModel() {
		return model;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}
	
	

}
