package method_class;

import java.util.Random;
import java.util.Scanner;

class User {

	int id;
	int pw;

}

public class Member01 {

	//메인의 변수 int -> 매개변수 int
	//메인의 변수 클래스 -> 매개변수 클래스

	public static void show(User _u1) { // Main 함수에서 User 타입의 자료형이므로 자료타입은 User
		System.out.println(_u1.id);
		System.out.println(_u1.pw);
	}

	public static void func1(Random _r) {

	}

	public static void func2(Scanner _sc) {

	}

	public static void main(String[] args) {

		//자바가 만들어준 api
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		//내가 만든 클래스
		//User 변수 생성
		User u1 = new User();
		u1.id = 1111;
		u1.pw = 2222;

	}

}
