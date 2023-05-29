package object;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		User u1 = new User("test01", "1234");
		
		//getClass(): 모든 정보를 담고 있는 클래스
		System.out.println(u1.getClass().getName());
		
		
		System.out.println("ID 입력> ");
		String id = sc.next();
		
		System.out.println("PW 입력> ");
		String pw = sc.next();
		
		User tmp = new User();
		tmp.setUser(id, pw);
		
		System.out.println(u1.getId().equals(tmp.getId()));
	}
}
