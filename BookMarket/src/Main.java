
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static String[][] booklst = new String[3][7];

	public static void main(String[] args) throws Exception {

		System.out.println("이름을 입력하세요: ");
		String name = sc.next();
		System.out.println("연락처를 입력허세요: ");
		String phone = sc.next();

		while (true) {
			System.out.println("******************************************");
			System.out.println("\twelcom to Shopping Mall");
			System.out.println("\twelcom to Book Market!");
			System.out.println("******************************************");
			System.out.println("1. 고객정보 확인하기\t\t4.바구니에 항목 추가하기");
			System.out.println("2. 장바구니 상품 목록 보기\t5. 장바구니의 항목 수량 줄이기");
			System.out.println("3. 장바구니비우기\t\t6. 장바구니의 항목 삭제하기");
			System.out.println("7. 영수증 표시하기\t\t8. 종료");
			System.out.println("******************************************");

			System.out.println("메뉴 번호를 선택해주세요");
			int sel = sc.nextInt();
			// System.out.println(sel + "번을 선택했습니다.");

			try {
				switch (sel) {
				case 1:
					new Main().menuGeustInfo(name, phone);
					break;

				case 2:
					System.out.println("2. 장바구니 상품 목록 보기");
					break;

				case 3:
					System.out.println("3. 장바구니 비우기");
					break;

				case 4:
					System.out.println("4.바구니에 항목 추가하기");
					menuCartAddItem();
					break;

				case 5:
					System.out.println("5. 장바구니의 항목 수량 줄이기");
					break;

				case 6:
					System.out.println("6. 장바구니의 항목 삭제하기");
					break;

				case 7:
					System.out.println("7. 영수증 표시하기");
					break;

				case 8:
					System.out.println("8. 종료");
					return;

				default:
					throw new MyException("1~8 사이의 숫자를 선택해주세요");
				}
			} catch (MyException e) {
				System.out.println(e);
			}
		}
	}

	void menuGeustInfo(String name, String phone) {
		System.out.println("====현재 고객 정보====");
		System.out.println("이름: " + name);
		System.out.println("연락처: " + phone);
		System.out.println("===================");
	}

	static void booklist() throws Exception {
		FileReader fr = new FileReader("book.txt");
		BufferedReader br = new BufferedReader(fr);

		String str;
		String[] tmp;

		int cnt = 0;

		while ((str = br.readLine()) != null) {
			tmp = str.split("\\|");

			for (int i = 0; i < tmp.length; i++) {
				booklst[cnt][i] = tmp[i];
			}
			cnt++;
		}

		fr.close();
		br.close();

		for (String[] s1 : booklst) {
			for (String s2 : s1) {
				System.out.print(s2 + " | ");
			}
			System.out.println();
		}

//		String str;
//		while ((str = br.readLine()) != null) {
//			System.out.println(str);
//		}
//		fr.close();
//		br.close();
	}

	// 2. 장바구니 조회하기
	static void menuCartAddItemList() throws Exception {
	}

	// 4. 장바구니 추가하기
	static void menuCartAddItem() throws Exception {
		booklist();

		boolean run = true;

		while (run) {
			System.out.println("추가할 도서의 ID를 선택하세요> (exit)이전메뉴");
			String bookID = sc.next();

			if (bookID.equals("exit")) {
				run = false;
			} else {
				for (int i = 0; i < booklst.length; i++) {
					System.out.println(booklst[i][0]);
					if (bookID.equals(booklst[i][0])) {
						bookID.equals(booklst[i][0]);
						System.out.println("제목 \"" + booklst[i][1] + "\" 도서가 추가되었습니다.");
												
						new CartItem().setItemBook(booklst[i][1]);
						
					} else {
						System.out.println("해당 도서가 존재하지 않습니다. 다시 선택해주세요.");
						break;
					}
				}}}
		}

}
