package innerclass_memberTest;

import java.util.Scanner;

import exception_account.MyException;

public class Account {

	static Scanner sc = new Scanner(System.in);

	String no;
	String name;
	private int money;

	class CheckCard {

		private String cardNum;
		private int pw;

		public CheckCard(String c_no, String c_name, int c_money, int c_pw) {
			no = c_no;
			name = c_name;
			money = c_money;
			this.pw = c_pw;
		}

		void pay() throws MyException {
			check();
			System.out.println("결제 금액을 입력하세요> (단위: 만원)");
			int money = sc.nextInt();
			withdraw(money);
		}

		void check() throws MyException {
			System.out.println("계좌 비밀번호를 입력하세요> ");
			int pw = sc.nextInt();
			if (pw != this.pw) {
				throw new MyException("패스워드가 맞지 않습니다.");
			} else {
				System.out.println("출금 가능");
			}
		}
	}

	void deposit(int inputMoney) {
		this.money += inputMoney;
		System.out.println("입금 계좌번호: " + this.no);
		System.out.println("입금자: " + this.name);
		System.out.println("입금 금액은 " + inputMoney + "만원입니다.\n총 금액은 " + this.money + "만원 입니다.");
	}

	void withdraw(int money) throws MyException {
		if (this.money < money) {
			throw new MyException("출금 한도 초과");
		} else {
			this.money -= money;
			System.out.println("출금 계좌번호: " + this.no);
			System.out.println("출금자: " + this.name);
			System.out.println("출금 금액은 " + money + "만원입니다.\n남은 금액은 " + this.money + "만원 입니다.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Account a = new Account();

		Account.CheckCard ch = a.new CheckCard("123-456-789", "이서희", 350000, 1234);
		
		try {
		ch.pay();
		}catch (MyException e) {
			System.out.println("에러발생: " + e);
		}
	}
}
