package phoneProject;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
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
		return "iPhone Unlocked";
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println(getCarrier()+getVersionNumber());
	}

}
