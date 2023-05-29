package testex;

import java.util.Scanner;

class Movie {

	int[] seat = new int[7];
	int money = 0;

	// 자리 출력
	void showSeat() {

		for (int i = 0; i < this.seat.length; i++) {
			if (this.seat[i] == 0) {
				System.out.print("[ ]");
			} else {
				System.out.print("O");
			}
		}
		System.out.println();
	}

	void choiceSeat(Scanner sc) {

		while (true) {
			System.out.println("몇번째 자리를 선택하시겠습니까?(1 ~ 8, 0은 종료) >");
			int idx = sc.nextInt() - 1;

			if (idx != -1)
				if (this.seat[idx] == 0) {
					this.seat[idx] = 1;
					this.money += 12000;

					// 예매현황
					for (int i = 0; i < this.seat.length; i++) {
						if (this.seat[i] == 0) {
							System.out.print("[ ]");
						} else {
							System.out.print("O");
						}
					}
					System.out.println();
					//

				} else {
					System.out.println("이미 예매된 번호 입니다. 다시 선택해주세요.");
				}
			else
				return;
		}
	}

	void showMoney() {
		System.out.println("총 매출금액은 " + this.money + "원 입니다.");
	}

}

public class MovieTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Movie m1 = new Movie();

		while (true) {
			System.out.println("1.예매, 2.종료 > ");
			int sel = sc.nextInt();

			if (sel == 1) {
				m1.showSeat();
				m1.choiceSeat(sc);
				m1.showMoney();
			} else if (sel == 2) {
				break;
			}
		}

	}

}
