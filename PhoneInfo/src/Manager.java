
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
				System.out.println("잘못된 선택입니다.");
				continue;
			}
		}
	}

	public static int choice() {
		System.out.println("선택하세요..");
		System.out.println("1.일반");
		System.out.println("2.대학");
		System.out.println("3.회사");
		System.out.println("4.나가기");
		int choose = Main.sc.nextInt();
		Main.sc.nextLine();
		return choose;
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

	PhoneInfo readFridInfo() {
		System.out.println("이름 : ");
		String name = Main.sc.nextLine();
		System.out.println("핸드폰 번호 : ");
		String phoneNumber = Main.sc.nextLine();
		return new PhoneInfo(name, phoneNumber);
	}

	PhoneInfo readUnivInfo() {
		System.out.println("이름 : ");
		String name = Main.sc.nextLine();
		System.out.println("전화번호 : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.println("전공 : ");
		String major = Main.sc.nextLine();
		System.out.println("학년 : ");
		int year = Main.sc.nextInt();
		Main.sc.nextLine();
		return new PhoneUnivInfo(name, phoneNumber, major, year);
	}

	PhoneInfo readCompanyInfo() {
		System.out.println("이름 : ");
		String name = Main.sc.nextLine();
		System.out.println("전화번호 : ");
		String phoneNumber = Main.sc.nextLine();
		System.out.println("회사 : ");
		String company = Main.sc.nextLine();
		return new PhoneCompanyInfo(name, phoneNumber, company);
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