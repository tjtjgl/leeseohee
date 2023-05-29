package game;

import java.util.Scanner;

public class FingerFlash {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HumanPlayer h1 = new HumanPlayer();
		ComPlayer c1 = new ComPlayer();

		String[] hands = { "가위", "바위", "보" };

		while (true) {
			int comUser = c1.nextHand();
			int playUser = h1.nextHand();

			System.out.println("나는 " + hands[playUser] + "이고 " + "컴퓨터는 " + hands[comUser] + "!");

			int judge = ((comUser - playUser) + 3) % 3;
			switch (judge) {
			case 0:
				System.out.println("비겼습니다.");
				break;
			case 1:
				System.out.println("졌습니다.");
				break;
			case 2:
				System.out.println("이겼습니다.");
				break;
			}

			System.out.println("다시 하시겠습니까? 예(1) 아니요(0)");
			int retry = sc.nextInt();

			if (retry == 0)
				return;

		}
	}
}
