package strategy2;

public class Tester {

	public static void main(String[] args) {
		
		Animal godofredo = new Dog();
		Animal jose = new Bird();
		
		System.out.println("Dog:" + godofredo.tryToFly());
		System.out.println("Bird:" + jose.tryToFly());

	}

}
