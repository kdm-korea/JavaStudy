public class Manager {
	PhoneInfo[] array = new PhoneInfo[100];
	int index = 0;

	void save() {
		array[index++] = readData();
		array[index - 1].showInfo();
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

	PhoneInfo readData() {
		System.out.println("�̸� : ");
		String name = Main.sc.nextLine();
		System.out.println("�ڵ��� ��ȣ : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.println("���� : ");
		String birthday = Main.sc.nextLine();
		PhoneInfo info = new PhoneInfo(name, phoneNumber, birthday);
		return info;
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