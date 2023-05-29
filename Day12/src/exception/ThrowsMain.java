package exception;

import java.util.Scanner;

public class ThrowsMain {

	// 다른 패키지에서 사용하기 위해 static으로 선언
	public static Scanner sc = new Scanner(System.in);

	public static void fn() throws Exception {

		System.out.println("정수1 입력> ");
		int num1 = sc.nextInt();

		System.out.println("정수2 입력> ");
		int num2 = sc.nextInt();

		System.out.println(num1 / num2);
	}

	public static void main(String[] args) {
		// 호출한 곳으로 예외를 던짐(양도)
		// 예외를 함수 안에 넣고 반복적으로 호출하여 처리하는것 보다는 한곳에서 처리하는 것이 좋음
		try {
			fn();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
