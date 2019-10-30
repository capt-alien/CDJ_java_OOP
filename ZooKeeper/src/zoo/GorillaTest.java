package zoo;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla ishmael = new Gorilla();
		
		ishmael.throwSomething();
		ishmael.throwSomething();
		ishmael.throwSomething();
		System.out.println(ishmael.displayEnergy());

		
		
		ishmael.eatBananas();
		ishmael.eatBananas();
		ishmael.eatBananas();
		
		System.out.println(ishmael.displayEnergy());
		
		ishmael.climb();
		
		System.out.println(ishmael.displayEnergy());
	}

}
