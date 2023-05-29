import java.util.Scanner;

class Bank {

	String name;
	String num;
	String pw;
	String money;

	Bank() {
	}

	Bank(String name, String num, String pw, String money) {
		this.name = name;
		this.num = num;
		this.pw = pw;
		this.money = money;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	void showInfo() {
		System.out.println("계좌명	: "+name);
		System.out.println("계좌번호	: "+num);
		System.out.println("계좌비밀번호: "+pw);
		System.out.println("계좌잔액	: "+money +"원");
	}
	

}

public class ClassEx08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Bank b = new Bank();
		
		System.out.println("이름>");
		String x = sc.nextLine();
		
		System.out.println("계좌번호>");
		String y = sc.nextLine();
		
		System.out.println("비밀번호>");
		String i = sc.nextLine();
		
		System.out.println("금액>");
		String j = sc.nextLine();
	
		b.setName(x);
		b.setNum(y);
		b.setPw(i);
		b.setMoney(j);
		
		b.showInfo();

	}
}
