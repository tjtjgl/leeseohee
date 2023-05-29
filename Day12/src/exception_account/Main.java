package exception_account;

import java.util.Scanner;

class Account {
	String no;
	String name;
	private int money;
	
	Scanner sc = new Scanner(System.in);

	public Account(String no, String name, int money) {
		this.no = no;
		this.name = name;
		this.money = money;
	}

	void deposit(int inputMoney) {
		this.money += inputMoney;
		System.out.println("입금 계좌번호: "+ this.no);
		System.out.println("입금자: "+ this.name);
		System.out.println("입금 금액은 " + inputMoney + "만원입니다.\n총 금액은 " + this.money + "만원 입니다.");
	}

	void withdraw(int money) throws MyException {
		if (this.money < money) {
			throw new MyException("출금 한도 초과");
		}else  {
			this.money -= money;
			System.out.println("출금 계좌번호: "+ this.no);
			System.out.println("출금자: "+ this.name);
			System.out.println("출금 금액은 " + money + "만원입니다.\n남은 금액은 " + this.money + "만원 입니다.");
		}
	}

}

public class Main {

	public static void main(String[] args) throws MyException {
		
		CheckCard ch= new CheckCard("123-456-789", "이서희", 350000, 1234);
		
		try {
		ch.pay();
		}catch (MyException e) {
			System.out.println("에러발생: " + e);
		}
		
	}

}
