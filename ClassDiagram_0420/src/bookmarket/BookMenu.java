package bookmarket;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

	Scanner sc = new Scanner(System.in);
	BookContoller bc = new BookContoller();

	void mainMenu() {
		bc.initBook();

		System.out.println("사용자 이름을 입력하세요> ");
		String name = sc.nextLine();
		System.out.println("연락처를 입력하세요> ");
		String phone = sc.nextLine();

		menuGeustInfo(name, phone);

		while (true) {
			System.out.println("******************************************");
			System.out.println("\twelcome to Shopping Mall");
			System.out.println("\twelcome to Book Market!");
			System.out.println("******************************************");
			System.out.println("1. 고객정보 확인하기\t\t4.바구니에 항목 추가하기");
			System.out.println("2. 장바구니 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기");
			System.out.println("3. 장바구니비우기\t\t6. 장바구니의 항목 삭제하기");
			System.out.println("7. 영수증 표시하기\t\t8. 종료");
			System.out.println("******************************************");
			System.out.println("메뉴 선택> ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				// 1. 고객정보 확인하기
				menuGeustInfo(name, phone);
				break;

			case 2:
				// 2. 장바구니 상품 목록 보기
				menuCartItemList();
				break;

			case 3:
				// 3. 장바구니 비우기
				menuCartClear();
				break;

			case 4:
				// 4.장바구니에 항목 추가하기
				menuCartAddItem2();
				break;

			case 5:
				// System.out.println("5. 장바구니의 항목 수량 줄이기");
				menuCartRemoveItemCount();
				break;

			case 6:
				// System.out.println("6. 장바구니의 항목 삭제하기");
				menuCartRemoveItem();
				break;

			case 7:
				// System.out.println("7. 영수증 표시하기");
				menuCartBill();
				break;

			case 8:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("1~8 사이의 숫자를 선택해주세요");

			}
		}
	}// 메인메뉴 끝

	// 1번 고객정보
	void menuGeustInfo(String name, String phone) {
		Person p = bc.menuGeustInfo(name, phone);

		System.out.println("======현재 접속중인 사용자 정보======");
		System.out.println("이름: " + p.getName());
		System.out.println("연락처: " + p.getPhone());
		System.out.println("==============================");
	}

	// 2번 상품 보기
	void menuCartItemList() {
		if (bc.menuCartItemList() == null) {
			System.out.println("장바구니에 담긴 도서가 없습니다.");
		} else {
			System.out.println("----------------------------------------------");
			System.out.println(" 도서ID\t\t|\t수량\t|\t합계");
			for (BookCart val : bc.menuCartItemList()) {
				System.out.println(" " + val.getIdFull() + "\t|\t" + val.getAmount() + "\t|\t" + val.getPrice());
			}
			System.out.println("----------------------------------------------");
		}
	}

	// 3번 장바구니 비우기
	void menuCartClear() {
		if (bc.menuCartClear() == 0) {
			System.out.println("장바구니에 담긴 도서가 없습니다.");
		} else {
			bc.menuCartClear();
			System.out.println("장바구니를 비웠습니다.");
		}
	}

	// 4번 추가
	void menuCartAddItem2() {
		bc.initList();

		System.out.println("추가할 도서의 ID를 입력하세요>");
		int id = sc.nextInt();

		if (bc.menuCartItem(id) == null) {
			System.out.println("해당 도서가 존재하지 않습니다.");
		} else {
			System.out.println("도서가 장바구니에 담겼습니다.");
		}

	}

	void menuCartRemoveItemCount() {
		System.out.println("삭제할 도서의 ID를 입력하세요>");
		int id = sc.nextInt();

		if (bc.menuCartRemoveItemCount(id) == null) {
			System.out.println("해당 도서가 존재하지 않습니다.");
		} else {
			System.out.println("해당 도서를 삭제하였습니다.");
		}
	}

	void menuCartRemoveItem() {
		System.out.println("전체삭제 할 도서의 ID를 입력하세요>");
		int id = sc.nextInt();

		if (bc.menuCartRemoveItem(id) == null) {
			System.out.println("해당 도서가 존재하지 않습니다.");
		} else {
			System.out.println("해당 도서를 완전히 삭제하였습니다.");
		}
	}

	void menuCartBill() {
		if(bc.menuCartItemList() == null) {
			System.out.println("장바구니가 비어 있습니다.");
			return;
			}
		
		
		sc.nextLine();
		System.out.println("배송받을 분이 고객 정보와 같습니까?");
		String sel = sc.nextLine();
		if (sel.equalsIgnoreCase("y")) {
			System.out.println("주소지 입력> ");
			String address = sc.nextLine();
			bc.menuCartBill(address, new Delivery());

		} else if (sel.equalsIgnoreCase("n")) {
			System.out.println("받을 분 성함 입력> ");
			String name = sc.nextLine();
			System.out.println("받을 분 연락처 입력> ");
			String phone = sc.nextLine();
			System.out.println("받을 분 주소 입력> ");
			String address = sc.nextLine();

			bc.menuCartBill(address, new Delivery(name, phone, address));
		}
	}

}
