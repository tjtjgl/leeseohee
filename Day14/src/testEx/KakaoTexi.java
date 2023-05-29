package testEx;

import java.util.Random;
import java.util.Scanner;

public class KakaoTexi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		// 목적지(destination)
		int desX = r.nextInt(20) + (-10);
		int desY = r.nextInt(20) + (-10);

		// 현재 위치
		int x = 0;
		int y = 0;

		// 방향(direction)
		int dir = 0;

		// 속도
		int speed = 0;

		// 요금
		int fee = 0;

		boolean run = true;
		while (run) {

			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");

			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				boolean run2 = true;
				while (run2) {
					System.out.println("방향을 입력하세요> 동(1)서(2)남(3)북(4)");
					int tmp = sc.nextInt();
					if (tmp < 5 && tmp > 0) {
						dir = tmp;
						run2 = false;
					} else {
						System.out.print("잘못 입력하였습니다. ");
					}
				}
				System.out.println();

			} else if (sel == 2) {
				boolean run2 = true;
				while (run2) {
					System.out.println("속도를 입력하세요>");
					int tmp = sc.nextInt();
					if (tmp < 4 && tmp > 0) {
						speed = tmp;
						System.out.println("속도 " + speed + "km로 설정되었습니다.");
						run2 = false;
					} else {
						System.out.print("1~3km만 속도 설정 가능합니다.");
					}
				}
				System.out.println();
			} else if (sel == 3) {
				if (dir == 1) {
					x=x+speed;

				} else if (dir == 2) {

				} else if (dir == 3) {

				} else if (dir == 4) {

				}

			}

		}

	}

}
