package strategy2;

public interface Flys {
	
	String fly();

}

class ItFlys implements Flys{

	public String fly() {
		return "Pode voar";
	}
	
}

class CantFly implements Flys{

	public String fly() {
		return "nao pode voar";
	}
	
}