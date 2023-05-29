package accout;

//접근 제어자
//private : Bank 클래스 외 접근 불가
class Bank {
	private String accName;
	private String accNum;
	private String accPw;
	private int balance;

	Bank() {
	}

	Bank(String accName, String accNum, String accPw, int balance) {
		this.accName = accName;
		this.accNum = accNum;
		this.accPw = accPw;
		this.balance = balance;
	}


	// 외부에서 출금
	int out(int money) {

		if (this.balance < money) {
			System.out.println("출금 불가");
			System.out.println("너 돈 " + this.balance + "원 있어");
			return 0;
		} else {
			this.balance -= money;
			System.out.println(money + "원 출금하였습니다. 남은 잔액은 "+ this.balance + "원 입니다.");
			return money;
		}
	}
	
	//외부에서 입금 
	void in(int money) {
		this.balance += money;
		System.out.println("입금 후 현재 잔액: " + this.balance + "원");
	}

	void info() {
		System.out.println("계좌명     : " + accName);
		System.out.println("계좌번호    : " + accNum);
		System.out.println("계좌비밀번호 : " + accPw);
		System.out.println("잔액      : " + balance + "원");
	}
}

public class Main {

	public static void main(String[] args) {

		Bank seohee = new Bank();

		seohee.in(100000000);
		seohee.out(3000);

//		seohee.balance = 1000000000;
//		
//		//main 클래스의 '잔액' 접근 가능
//		System.out.println(seohee.balance);
//		
//		//main 클래스의 '잔액' 수정도 가능
//		seohee.balance -= 100000000;
//		System.out.println(seohee.balance);
	}
}
