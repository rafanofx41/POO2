package strategy;

public class TravelManager {
	
	private Strategy strategy;
	
	public TravelManager(Strategy strategy) {
		this.strategy = strategy;
	}

	public void travel() {
		this.strategy.onTravelBy();
	}
}
