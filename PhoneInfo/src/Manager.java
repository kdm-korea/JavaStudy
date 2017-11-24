
public class Manager {
	PhoneInfo[] array = new PhoneInfo[100];
	int index = 0;

	public void choiceInput() {
		while (true) {
			switch (choice()) {
			case 1:
				array[index++] = readFridInfo();
				array[index - 1].showInfo();
				break;
			case 2:
				array[index++] = readUnivInfo();
				array[index - 1].showInfo();
				break;
			case 3:
				array[index++] = readCompanyInfo();
				array[index - 1].showInfo();
				break;
			case 4:
				return;
			default:
				System.out.println("�߸��� �����Դϴ�.");
				continue;
			}
		}
	}

	public static int choice() {
		System.out.println("�����ϼ���..");
		System.out.println("1.�Ϲ�");
		System.out.println("2.����");
		System.out.println("3.ȸ��");
		System.out.println("4.������");
		int choose = Main.sc.nextInt();
		Main.sc.nextLine();
		return choose;
	}

	void search() {
		System.out.println("������ �˻��� �����մϴ�...");
		System.out.println("name : ");
		int val = matchName(Main.sc.nextLine());
		if (val >= 0) {
			array[val].showInfo();
		}
	}

	void delete() {
		System.out.println("������ ������ �����մϴ�...");
		System.out.println("name : ");
		int val = matchName(Main.sc.nextLine());
		if (val >= 0) {
			for (int tmp = val; tmp <= index; tmp++) {
				array[tmp] = array[tmp + 1];
			}
			index--;
			System.out.println("�����Ǿ����ϴ�.");
		}
	}

	PhoneInfo readFridInfo() {
		System.out.println("�̸� : ");
		String name = Main.sc.nextLine();
		System.out.println("�ڵ��� ��ȣ : ");
		String phoneNumber = Main.sc.nextLine();
		return new PhoneInfo(name, phoneNumber);
	}

	PhoneInfo readUnivInfo() {
		System.out.println("�̸� : ");
		String name = Main.sc.nextLine();
		System.out.println("��ȭ��ȣ : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.println("���� : ");
		String major = Main.sc.nextLine();
		System.out.println("�г� : ");
		int year = Main.sc.nextInt();
		Main.sc.nextLine();
		return new PhoneUnivInfo(name, phoneNumber, major, year);
	}

	PhoneInfo readCompanyInfo() {
		System.out.println("�̸� : ");
		String name = Main.sc.nextLine();
		System.out.println("��ȭ��ȣ : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.println("ȸ�� : ");
		String company = Main.sc.nextLine();
		return new PhoneCompanyInfo(name, phoneNumber, company);
	}

	int matchName(String name) {
		for (int tmp = 0; tmp < index; tmp++) {
			if (name.equals(array[tmp].name)) {
				return tmp;
			}
		}
		System.out.println("ã�� ���Ͽ����ϴ�..");
		return -1;
	}
}