import java.util.Scanner;

public class Main implements ChooseMainMenu{
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Manager mg = new Manager();
		while (true) {
			try {
				switch (showMenu()) {
				case dataInput:
					mg.choiceInput();
					continue;
				case dataSearch:
					mg.search();
					continue;
				case dataDelete:
					mg.delete();
					continue;
				case programExit:
					System.out.println("종료되었습니다");
					break;
				default:
					System.out.println("잘못된 선택입니다.");
					continue;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("제대로 된 값을 입력하십시오.");
			}
			return;
		}
	}

	public static int showMenu() {
		System.out.println("선택하세요..");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.프로그램 종료");
		System.out.println("선택 : ");
		int choose = sc.nextInt();
		sc.nextLine();
		return choose;
	}
}
