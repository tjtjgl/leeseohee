package testEx;

import java.util.Scanner;

public class Shoppingmall_Back {
	/*
	 * # 쇼핑몰 뒤로가기
	 * 
	 * 문제) 쇼핑몰메인메뉴에서 남성의류를 선택해서 
	 *      뒤로가기 누르기전까지 남성의류 페이지 를 유지할려고한다.
	 * 힌트) 개층 별로 반복문을 추가 해주면된다. 
	 * 1. 남성의류
	 * 		1) 티셔츠
	 * 		2) 바지
	 * 		3) 뒤로가기
	 * 2. 여성의류
	 * 		1) 가디건
	 * 		2) 치마
	 * 		3) 뒤로가기
	 * 3. 종료
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		
		while (run) {

			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");

			System.out.print("메뉴 선택 : ");
			int sel1 = sc.nextInt();

			if (sel1 == 1) {
				boolean run2 = true;
				while (run2) {
					System.out.println("1)티셔츠");
					System.out.println("2)바지");
					System.out.println("3)뒤로가기");

					int sel2 = sc.nextInt();

					if (sel2 == 1) {
						System.out.println("티셔츠를 선택하였습니다.");
					} else if (sel2 == 2) {
						System.out.println("바지를 선택하였습니다.");
					} else if (sel2 == 3) {
						run2 = false;
					}
				}
			}

			else if (sel1 == 2) {
				boolean run2 = true;
				while (run2) {
					System.out.println("1)가디건");
					System.out.println("2)치마");
					System.out.println("3)뒤로가기");

					int sel2 = sc.nextInt();

					if (sel2 == 1) {
						System.out.println("가디건을 선택하였습니다.");
					} else if (sel2 == 2) {
						System.out.println("치마를 선택하였습니다.");
					} else if (sel2 == 3) {
						run2 = false;
					}
				}
			} else if (sel1 == 3) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}
}
