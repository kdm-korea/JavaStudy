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
					System.out.println("����Ǿ����ϴ�");
					break;
				default:
					System.out.println("�߸��� �����Դϴ�.");
					continue;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("����� �� ���� �Է��Ͻʽÿ�.");
			}
			return;
		}
	}

	public static int showMenu() {
		System.out.println("�����ϼ���..");
		System.out.println("1.������ �Է�");
		System.out.println("2.������ �˻�");
		System.out.println("3.������ ����");
		System.out.println("4.���α׷� ����");
		System.out.println("���� : ");
		int choose = sc.nextInt();
		sc.nextLine();
		return choose;
	}
}
