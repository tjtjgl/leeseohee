package control;

import java.util.Scanner;

public class ifEx05_03 {

	public static void main(String[] args) {

		// 국어,수학,영어 3개 받아 평균내기
		// 평균 90점 이상인 경우 중 국영수 90점 이상이면 최우수, 그 중 하나라도 90 이하면 우수
		// 평균 80점 이상 89점 이하인 경우 중 국영수 하나라도 90점 이상이면 장려상, 모두 80점대이면 입상
		// 평균 80점 미만이면 탈락

		Scanner sc = new Scanner(System.in);

		System.out.println("국어점수>");
		int kor = sc.nextInt();
		System.out.println("수학점수>");
		int math = sc.nextInt();
		System.out.println("영어점수>");
		int eng = sc.nextInt();

		int avg = (kor + math + eng) / 3;

		if (avg >= 90) {
			if (kor >= 90 && math >= 90 && eng >= 90) {
				System.out.println("최우수상");
			} else {
				System.out.println("우수상");
			}
		} else if (avg < 90 && avg >= 80) {
			if (kor >= 90 || math >= 90 || eng >= 90) {
				System.out.println("장려상");
			} else {
				System.out.println("입상");
			}
		} else {
			System.out.println("안녕");
		}

	}

}
