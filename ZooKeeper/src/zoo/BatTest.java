package zoo;

public class BatTest {

	public static void main(String[] args) {
		Bat batty = new Bat();
		
		batty.attackTown();
		batty.fly();
		
		System.out.println(batty.displayEnergy());
		
		batty.eatHumans();
		batty.eatHumans();
		batty.eatHumans();

		System.out.println(batty.displayEnergy());

		batty.attackTown();	
		batty.attackTown();	
		
		System.out.println(batty.displayEnergy());
		
		batty.fly();
		batty.fly();
		System.out.println(batty.displayEnergy());

	}

}
