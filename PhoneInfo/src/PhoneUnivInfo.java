
public class PhoneUnivInfo extends PhoneInfo{
	String major = null;
	int year = 0;
	public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("major : "+major);
		System.out.println("Year : "+year);
	}
}
