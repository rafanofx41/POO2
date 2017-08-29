package composicao;

public class Monitor {
	
	private String model;
	private int size;
	
	/*Aqui vem a composição, a resolução faz parte do monitor, mas o monitor nao eh uma resolução,
	 * mas ele tem uma resolução.*/
	private Resolution nativeResolution;
	
	
	public Monitor(String model, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x, int y, String color) {
		System.out.println("Drawing pixel at " + x + " , " + " in colour " + color);
	}
	
	
	
	
	

}
