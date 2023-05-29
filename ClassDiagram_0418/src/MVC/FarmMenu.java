package MVC;

import java.util.Scanner;

public class FarmMenu {
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();

	void mainMenu() {
		while (true) {
			System.out.println("===========KH 마트===========");
			System.out.println("*****메인 메뉴*****");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.println("메뉴 선택>");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				adminMenu();
				break;

			case 2:
				customerMenu();
				break;

			case 9:
				System.out.println("종료합니다.");
				return;

			default:
				System.out.println("잘못 입력하였습니다. 다시 선택해 주세요");
			}
		}
	}

	void adminMenu() {
		while (true) {
			System.out.println("*****직원 메뉴*****");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("메뉴 선택>");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				addNewKind();
				break;

			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				return;

			default:
				System.out.println("잘못 입력하였습니다. 다시 선택해 주세요");
			}
		}
	}

	void customerMenu() {
		while (true) {
			System.out.println("*****고객 메뉴*****");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.println("메뉴 선택>");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				buyFarm();
				break;

			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				return;

			default:
				System.out.println("잘못 입력하였습니다. 다시 선택해 주세요");
			}
		}
	}

	void addNewKind() {
		boolean run = true;
		while (run) {
			Farm f = null;
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			int sel = sc.nextInt();
			sc.nextLine();
			System.out.println("이름을 입력하세요>");
			String name = sc.nextLine();
			System.out.println("수량을 입력하세요>");
			int amount = sc.nextInt();

			switch (sel) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 선택해 주세요");
			}
			fc.addNewKind(f, amount);
			System.out.println("새 농산물이 추가되었습니다.");
			run = false;
		}
	}

	void removeKind() {
		boolean run = true;
		while (run) {
			Farm f = null;
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			int sel = sc.nextInt();
			sc.nextLine();
			System.out.println("삭제할 이름을 입력하세요> ");
			String name = sc.nextLine();

			switch (sel) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 선택해 주세요");
			}
			if (fc.removeKind(f)) {
				System.out.println("농산물 삭제에 성공하였습니다.");
				// fc.removeKind(f);
				run = false;
			} else
				System.out.println("삭제할 농산물이 존재하지 않습니다.");
		}

	}

	void changeAmount() {
		boolean run = true;
		while (run) {
			Farm f = null;
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			int sel = sc.nextInt();
			sc.nextLine();
			System.out.println("이름을 입력하세요> *띄어쓰기로 구분");
			String name = sc.nextLine();
			System.out.println("수량을 입력하세요> *띄어쓰기로 구분");
			int amount = sc.nextInt();

			switch (sel) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 선택해 주세요");
			}
			if (fc.changeAmount(f, amount)) {
				System.out.println("농산물 수량이 수정되었습니다.");
				// fc.changeAmount(f, amount);
				run = false;
			} else
				System.out.println("농산물 수량 수정에 실패하였습니다.");
		}
	}

	void printFarm() {
		fc.printFarm();
	}

	void buyFarm() {
		boolean run = true;
		while (run) {
			Farm f = null;
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			int sel = sc.nextInt();
			sc.nextLine();
			System.out.println("이름을 입력하세요> ");
			String name = sc.nextLine();

			switch (sel) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 선택해 주세요");
			}
			if (fc.buyFarm(f)) {
				System.out.println(name + "을 구입하였습니다.");
				run = false;
			} else
				System.out.println("해당 목록이 존재하지 않습니다.");
		}

	}

	void removeFarm() {
		boolean run = true;
		while (run) {
			Farm f = null;
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			int sel = sc.nextInt();
			sc.nextLine();
			System.out.println("취소할 항목의 이름을 입력하세요> ");
			String name = sc.nextLine();

			switch (sel) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 선택해 주세요");
			}
			if (fc.removeFarm(f)) {
				System.out.println("구매 취소에 성공하였습니다.");
				run = false;
			} else
				System.out.println("구매목록에 존재하지 않습니다.");
		}
	}

	void printBuyFarm() {
		fc.printBuyFarm();
	}

}
