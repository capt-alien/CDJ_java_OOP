package phoneProject;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
		super(versionNumber, batteryPercentage, carrier, ringtone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		return getRingTone();
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Galexy almost unlocked";
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println(getCarrier()+ getVersionNumber());
	}

}
