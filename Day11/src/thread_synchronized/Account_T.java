package thread_synchronized;

import java.util.Scanner;

public class Account_T extends Thread {
	private String name;
	private int pw;
	private int money = 1000000;

	public Account_T(String name, int pw) {

		this.name = name;
		this.pw = pw;
	}

	void withd(String name, int pw) {
		Scanner sc = new Scanner(System.in);
		if (this.pw == pw) {
			System.out.println("출금할 금액을 입력해주세요 : ");

			int wd = sc.nextInt();

			if (wd <= money) {
				money -= wd;
				System.out.println("잔액:" + money + "\n출금액:" + wd + "\n출금한사람:" + name);
			} else {
				System.out.println("잔액이 부족합니다.");
			}

		} else {
			System.out.println(" 비번이 잘못되었습니다.");
		}
	}
}
