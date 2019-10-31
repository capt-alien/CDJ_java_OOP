package phoneProject;

public class PhoneTest {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy ("s9", 99, "Verizon", "Brrrinngnggggggg");
		IPhone iPhone10 = new IPhone("X+", 100, "T-Mobile", "ALERT ALERT ALERT");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iPhone10.displayInfo();
		System.out.println(iPhone10.ring());
		System.out.println(iPhone10.unlock());

	}

}
