package exception;

import java.util.Scanner;

public class Throwmain {

	// 예외를 일부러 발생시키는 경우
	// JVM이 발생시키는 메세지는 보기 힘드니까 내가 정의한 메세지로 주고 싶을 때
	public static void check(int num) throws NumberFormatException {
		if (num < 0) {
			throw new NumberFormatException("0보다 작습니다.");
		} else {
			System.out.println("num");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력> ");
		int num = sc.nextInt();

		try {
		check(num);
		} catch (NumberFormatException e) {
			System.out.println("예외발생 " + e);
		} 
	}
}
