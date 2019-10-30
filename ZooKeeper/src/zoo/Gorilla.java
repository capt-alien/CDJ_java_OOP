package zoo;

public class Gorilla extends Mammal{
		public int throwSomething() {
			System.out.println("Gorilla threw an object!");
			energyLevel -=5;
			return energyLevel;
		} 
		public int eatBananas() {
			System.out.println("Gorilla ate some Bananas");
			energyLevel+= 10;
			return energyLevel;

		}
		public int climb() {
			System.out.println("Gorilla climed a tree!");
			energyLevel -= 10;
			return energyLevel;
		}
}