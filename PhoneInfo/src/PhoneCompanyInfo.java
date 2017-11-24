
public class PhoneCompanyInfo extends PhoneInfo{
	String company = null;
	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("Company : "+company);
	}
}
