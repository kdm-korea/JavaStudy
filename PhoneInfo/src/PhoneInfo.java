
public class PhoneInfo {
	String name = null, phoneNumber = null;//, birthday = null;

	PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	/*PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}*/
/*	PhoneInfo(String kind, String name, String phoneNumber, String birthday) {
		this.kind = kind;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
*/
	void showInfo() {
		System.out.println("�Էµ� ���� ���...");
		System.out.println("�̸� : " + name);
		System.out.println("�ڵ�����ȣ : " + phoneNumber);
	}

}
