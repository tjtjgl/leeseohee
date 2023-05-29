package com.kh.practice.comp.func;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public void rps() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		System.out.println("사용자 이름을 입력하세요> ");
		String name = sc.next();

		System.out.println("가위바위보를 시작합니다.");

		int win = 0;
		int lose = 0;
		int same = 0;

		while (true) {
			System.out.println(name + "님 선택하세요> 1)가위, 2)바위, 3)보, 0)종료");
			int my = sc.nextInt();
			int com = r.nextInt(3) + 1;

			int judge = (my - com + 3) % 3;

			if (my < 4 && my > 0) {
				// 결과
				if (judge == 1) {
					System.out.println("이겼다!");
					win += 1;
				} else if (judge == 2) {
					System.out.println("졌다!");
					lose += 1;
				} else if (my == com) {
					System.out.println("비겼다!");
					same += 1;
				} //결과 끝
			} else if (my == 0) {
				System.out.println("========게임종료========");
				System.out.println("이긴 횟수: " + win + "회");
				System.out.println("진 횟수: " + lose + "회");
				System.out.println("비긴 횟수: " + same + "회");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
