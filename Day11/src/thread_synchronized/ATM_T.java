package thread_synchronized;

import java.util.Scanner;

public class ATM_T extends Thread {

	Account_T a;
	String name;

	public ATM_T(Account_T kim, String name) {
		this.a = kim;
		this.name = name;

	}

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		System.out.println(name);
		System.out.println("패스워드를 입력하세요");
		int pw = sc.nextInt();
		a.withd(this.name, pw);
	}

	public static void main(String[] args) {

		Account_T kim = new Account_T("김우영", 5129);
		ATM_T mother = new ATM_T(kim, "엄마");
		ATM_T father = new ATM_T(kim, "아빠");
		ATM_T me = new ATM_T(kim, "나");

		father.run();
		mother.run();
		me.run();
	}
}