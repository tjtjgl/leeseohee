import java.util.Scanner;
import java.util.TreeMap;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);

	LotteryController lc = new LotteryController();

	void mainMenu() {

		while (true) {
			System.out.println("=========KH 추첨 프로그램=========");
			System.out.println("*****메인 메뉴*****");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");
			System.out.println("메뉴 선택> ");

			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				intsertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");

			}
		}

	}

	void intsertObject() {
		boolean run1 = true;
		while (run1) {
			System.out.println("추가할 인원을 입력하세요>");
			int cnt = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < cnt; i++) {
				System.out.println("이름을 입력하세요");
				String name = sc.nextLine();
				System.out.println("전화번호를 입력하세요");
				String phone = sc.nextLine();

				Lottery l = new Lottery(name, phone);

				if (!(lc.insertObject(l))) {
					System.out.println("중복 대상입니다. 다시 입력하세요.");
					i--;
				} else {
					lc.insertObject(l);
					System.out.println((i + 1) + "명 추가 완료");
				}
			}
			run1 = false;
		}

	}

	void deleteObject() {
		sc.nextLine();
		System.out.println("삭제할 이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("삭제할 전화번호를 입력하세요");
		String phone = sc.nextLine();

		Lottery l = new Lottery(name, phone);

		lc.deleteObject(l);
	}

	void winObject() {
		if (lc.winObject() == null) {
			System.out.println("추첨 대상이 부족합니다.");
		} else
			System.out.println(lc.winObject());
	}

	void sortedWinObject() {
		for (Lottery val : lc.sortedObject()) {
			System.out.print(val + " ");
		}

	}

	void searchWinner() {
		sc.nextLine();
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력하세요");
		String phone = sc.nextLine();

		Lottery l = new Lottery(name, phone);

		if (lc.searchWinner(l)) {
			System.out.println(l + "님 당첨되었습니다.");
		} else
			System.out.println(l + "님 낙첨되었습니다.");
	}

}
