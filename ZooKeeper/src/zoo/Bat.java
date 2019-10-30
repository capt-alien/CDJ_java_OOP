package zoo;

public class Bat extends Mammal{
	public Bat() {
		this.energyLevel=300;
	}
	
	public int fly() {
		System.out.println("Bat is takeing off");
		energyLevel -= 50;
		return energyLevel;
	}
	public int eatHumans() {
		System.out.println("Ohh Myyy GAWWDDD!!!! He is eatting Billy!!");
		energyLevel += 25;
		return energyLevel;
	}
	public int attackTown() {
		System.out.println("Ohh the HUmanity!!");
		energyLevel -= 100;
		return energyLevel;
	}
}
