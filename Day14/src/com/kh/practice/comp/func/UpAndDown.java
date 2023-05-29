package com.kh.practice.comp.func;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public void upDown() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int num = r.nextInt(100) + 1;
		int cnt = 1;
		boolean run = true;

		while (run) {
			System.out.println("1~100 사이의 임의의 난수를 맞춰보세요> ");
			int myNum = sc.nextInt();
			if (myNum > num) {
				System.out.println("Down!");
				cnt += 1;
			} else if (myNum < num) {
				System.out.println("up!");
				cnt += 1;
			} else if (myNum == num) {
				System.out.println("정답입니다!" + cnt + "회만에 맞추셨습니다.");
				run = false;
			}
		}
	}
}
