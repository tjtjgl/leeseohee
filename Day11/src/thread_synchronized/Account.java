package thread_synchronized;

import java.util.Scanner;

public class Account {
	private String name; // 계좌명
	private int pw;
	private int money = 10000; // 잔액
	
	// 출금 메소드
	synchronized int withd(String name, int pw) {
		Scanner sc = new Scanner(System.in);

		this.name = name;
		this.pw = pw;

		System.out.println(name + "님 출금패스워드를 입력하세요");
		int inputPw = sc.nextInt();

		if (inputPw == this.pw) {
			System.out.println("출금할 금액을 입력하세요");
			int inputMoney = sc.nextInt();
			if (this.money > inputMoney) {
				this.money -= inputMoney;
				System.out.println("현재 남은 금액은 " + money + "원 이며 출금자는 " + name + "님 입니다.");
			} else if (this.money < inputMoney) {
				System.out.println(name + "님 한도초과");
				return 0;
			}
		} else if (inputPw != this.pw) {
			System.out.println(name + "님 패스워드 불일치");
			return 0;
		}
		return money;
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}

}
//=========================================================================
class ATM extends Thread {
	Account ac; // 고객 정보 받는 참조변수
	String who; // 이용하는 사람의 정보
	int pw;

	public ATM(String name,int pw,Account ac) {
		this.who = name;
		this.ac = ac;	
		this.pw =pw;		
	}
	
	@Override
	public void run() {
		ac.withd(who, pw);
	}
}