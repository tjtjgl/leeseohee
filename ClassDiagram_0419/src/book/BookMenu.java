package book;

import java.util.Calendar;
import java.util.Scanner;

public class BookMenu {

	Scanner sc = new Scanner(System.in);

	BookController bc = new BookController();


	private Book[] bArr = new Book[10];

	public BookMenu() {

	}

	void mainMenu() throws Exception {
		while (true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.println("메뉴 번호> ");

			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				fileSave();
				break;
			case 2:
				fileRead();
				break;

			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}

	void fileSave() throws Exception {
		sc.nextLine();
		System.out.println("도서 명: ");
		String title = sc.nextLine();
		System.out.println("저자 명: ");
		String author = sc.nextLine();
		System.out.println("도서 가격: ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.println("출판 날짜(yyyy-mm-dd): ");
		String[] dates = sc.nextLine().split("-");
		int year = Integer.parseInt(dates[0]);
		int month = Integer.parseInt(dates[1]);
		int day = Integer.parseInt(dates[2]);
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, year);
		date.set(Calendar.MONTH, month);
		date.set(Calendar.DATE, day);
		System.out.println("할인율: ");
		Double discount = sc.nextDouble();
		
		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i] == null) {
				bArr[i] = new Book(title, author, price, date, discount);
				break;
			}
		}
		bc.fileSave(bArr);
	}

	void fileRead() throws Exception {
		bc.fileRead();
	}

}
