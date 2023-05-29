package snackstore;

import java.util.Scanner;

public class SnackController {

	Snack s = new Snack();

	String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);

		return "저장완료!";
	}

	void confirmData() {
		boolean run = true;

		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("저장한 정보를 확인하시겠습니까? (y/n) ");
			char sel = sc.next().charAt(0);

			switch (sel) {
			case 'y':
				s.information();
				run = false;
				break;
			case 'n':
				return;
			default:
				System.out.println("잘못 입력하였습니다.");

			}
		}
	}

}
