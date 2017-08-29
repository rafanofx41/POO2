package composicao;

public class Tester {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Gabinete gabinete = new Gabinete("atx", dimensions);
		
		
		Monitor monitor = new Monitor("LG", 24, new Resolution(2540, 1440));
		
		PlacaMae placaMae = new PlacaMae("asrock", "lga 1151", 16000);
		
		PC pc = new PC(gabinete, monitor, placaMae);
		
		pc.getMonitor().drawPixelAt(1500, 1200, "red");
		pc.getPlacamae().loadProgram("Ubuntu");
		

	}

}
