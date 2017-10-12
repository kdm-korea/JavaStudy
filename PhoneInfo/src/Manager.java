public class Manager {
	PhoneInfo[] array = new PhoneInfo[100];
	int index = 0;

	void save() {
		array[index++] = readData();
		array[index - 1].showInfo();
	}

	void search() {
		System.out.println("데이터 검색을 시작합니다...");
		System.out.println("name : ");
		int val = matchName(Main.sc.nextLine());
		if (val >= 0) {
			array[val].showInfo();
		}
	}

	void delete() {
		System.out.println("데이터 삭제를 시작합니다...");
		System.out.println("name : ");
		int val = matchName(Main.sc.nextLine());
		if (val >= 0) {
			for (int tmp = val; tmp <= index; tmp++) {
				array[tmp] = array[tmp + 1];
			}
			index--;
			System.out.println("삭제되었습니다.");
		}
	}

	PhoneInfo readData() {
		System.out.println("이름 : ");
		String name = Main.sc.nextLine();
		System.out.println("핸드폰 번호 : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.println("생일 : ");
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
		System.out.println("찾지 못하였습니다..");
		return -1;
	}
}