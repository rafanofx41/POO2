package strategy;

public class Tester {

	public static void main(String[] args) {
		TravelManager manager = new TravelManager(new OnFoot());
		manager.travel();
		
		TravelManager manager2 = new TravelManager(new CarStrategy());
		manager2.travel();
		
		TravelManager manager3 = new TravelManager(new BusStrategy());
		manager3.travel();
		

	}

}
