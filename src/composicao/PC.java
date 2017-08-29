package composicao;

public class PC {
	private Gabinete gabinete;
	private Monitor monitor;
	private PlacaMae placamae;
	
	public PC(Gabinete gabinete, Monitor monitor, PlacaMae placamae) {
		super();
		this.gabinete = gabinete;
		this.monitor = monitor;
		this.placamae = placamae;
	}

	public Gabinete getGabinete() {
		return gabinete;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public PlacaMae getPlacamae() {
		return placamae;
	}
	
	
	
}
