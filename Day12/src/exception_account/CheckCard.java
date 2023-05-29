package exception_account;

public class CheckCard extends Account {

	private String cardNum;
	private int pw;

	public CheckCard(String no, String name, int money, int pw) {
		super(no, name, money);
		this.pw = pw;
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

		if (pw != this.pw ) {
			throw new MyException("패스워드가 맞지 않습니다.");
		} else {
			System.out.println("출금 가능");
		}
	}
}
