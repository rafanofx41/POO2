package strategy2;

public class Bird extends Animal {

	public Bird() {
		super();
		
		setSound("pruu");
		
		flyingType = new ItFlys();
	}
}
