package method;

import java.util.Scanner;

public class MethodsEx01_method_use {

	// 반복되는 문장들을 묶는 메서드는 클래스 안에 선언
	public static String grade(int score) {

		String res = null;

		if (score >= 90) {
			res = "A";
		} else if (score >= 80) {
			res = "B";
		} else if (score >= 70) {
			res = "C";
		} else if (score >= 60) {
			res = "D";
		} else {
			res = "F";
		}
		return res;
	}

	// 프로그램이 시작하면 가장 먼저 실행되는 함수 = main 함수 (시작점)
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 함수 실행(호출)
		System.out.println("국어 등급은 " + grade(90));
		System.out.println("수학 등급은 " + grade(80));
		System.out.println("영어 등급은 " + grade(100));

	}

}
