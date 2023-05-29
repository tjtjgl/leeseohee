package method;

import java.util.Scanner;

public class MethodsEx01_method_no_use {

	public static void main(String[] args) {

		// 국어 수학 영어 각각의 점수를 입력

		Scanner sc = new Scanner(System.in);

		int kor, math, eng;
		String res;

		// 한명의 학생의 점수를 입력하여 등급 출력 -> 배열과 반복문
		int[] scores = new int[3];
		String[] subjects = { "국어", "영어", "수학" };

		for (int i = 0; i < scores.length; i++) {
			System.out.println("국영수 입력하세요>");
			scores[i] = sc.nextInt();

			if (scores[i] >= 90) {
				res = "A";
			} else if (scores[i] >= 80) {
				res = "B";
			} else if (scores[i] >= 70) {
				res = "C";
			} else if (scores[i] >= 60) {
				res = "D";
			} else {
				res = "F";
			}

			System.out.println(subjects[i] + " 과목의 점수는 " + scores[i] + "점 입니다. 등급은 " + res + "에요");
		}

	}
}
