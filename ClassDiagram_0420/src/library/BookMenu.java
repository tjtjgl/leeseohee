package library;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

	Scanner sc = new Scanner(System.in);

	BookController bc = new BookController();

	String[] categoryList = { "인문", "자연과학", "의료", "기타" };

	void mainMenu() {
		while (true) {
			System.out.println("=====Welcome KH Library=====");
			System.out.println("*****메인 메뉴*****");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순");
			System.out.println("9. 종료");
			System.out.println("메뉴 선택> ");

			int sel = sc.nextInt();

			switch (sel) {

			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				return;

			default:
				System.out.println("잘못 선택하였습니다. 다시 입력해주세요.");
			}
		}

	}

	public void insertBook() {
		sc.nextLine();
		System.out.println("도서명을 입력하세요> ");
		String title = sc.nextLine();
		System.out.println("저자명을 입력하세요> ");
		String author = sc.nextLine();
		System.out.println("장르를 입력하세요> (1. 인문학, 2. 자연과학, 3. 의료, 4. 기타)");
		int intCategory = sc.nextInt();
		System.out.println("가격을 입력하세요> ");
		int price = sc.nextInt();

		String category = null;

		for (int i = 0; i < categoryList.length; i++) {
			if (intCategory == (i + 1)) {
				category = categoryList[i];
			}
		}

		bc.insertBook(new Book(title, author, category, price));
	}

	public void selectList() {

		ArrayList<Book> bookList = bc.selectList();

		if (bookList == null) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (Book val : bookList) {
				System.out.println(val);
			}
		}
	}

	public void searchBook() {
		sc.nextLine();
		System.out.println("검색할 키워드를 입력하세요> ");
		String keyword = sc.nextLine();

		ArrayList<Book> searchList = bc.searchBook(keyword);

		if (searchList == null) {
			System.out.println("존재하는 도서가 없습니다.");
		} else {
			for (Book val : searchList) {
				System.out.println(val);
			}
		}
	}

	public void deleteBook() {
		sc.nextLine();
		System.out.println("삭제할 도서명을 입력하세요> ");
		String title = sc.nextLine();
		System.out.println("삭제할 저자명을 입력하세요> ");
		String author = sc.nextLine();

		Book remove = bc.deleteBook(title, author);

		if (remove != null) {
			System.out.println("성공적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
	}

	public void ascBook() {
		if (bc.ascBook() == 1) {
			System.out.println("정렬 성공");
		} else
			System.out.println("정렬 실패");
	}

}
