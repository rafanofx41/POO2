package composicao;

public class PlacaMae {
	
	private String modelo;
	private String chipset;
	private int slotsRam;
	
	public PlacaMae(String modelo, String chipset, int slotsRam) {
		super();
		this.modelo = modelo;
		this.chipset = chipset;
		this.slotsRam = slotsRam;
	}
	
	public void loadProgram(String programName) {
		System.out.println("Program " + programName + " is now loading");
	}
	
	public String getModelo() {
		return modelo;
	}
	public String getChipset() {
		return chipset;
	}
	public int getSlotsRam() {
		return slotsRam;
	}

	
}
