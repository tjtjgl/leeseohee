package control;

import java.util.Scanner;

public class ifEx {

	public static void main(String[] args) {
		// 문제) 시험점수3개를 입력받고 학점출력
		Scanner sc = new Scanner(System.in);
	
		System.out.println("3개의 시험 점수 입력");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int avg = (num1+num2+num3)/3;
		
		String res = ""; //결과를 저장하는 변수
		
		if (avg >=90 && avg <=100) {
			res="A";
		} else if(avg >=80 && avg <=89) {
			res="B";
		}else if (avg >=70 && avg <=79) {
			res="C";
		}else {
			res="재시험";
		}
		
		System.out.println("평균 점수: "+avg);
		
		/*숫자 자리수 구하기, 327
		System.out.println(327 / 100); //100의 자리 구하기
		System.out.println((327 % 100) /10); //10의 자리 구하기
		*/
		//1의 자리 저장
		int s = avg %10;
		
		if((s >=7 && avg>= 70) || avg==100) {
			res += "+";
		}

		System.out.println("등급: "+res);
		
		
		
		
				
		/*int score1=77;
		int score2=98;
		int score3=90;
		 		
		// 조건 1) 3과목의 평균을 가지고 점수를 매긴다.
		int avg = (score1+score2+score3)/3;
			
		// 조건 2) 3과목의 평균이 100~90 ==> A
		// 조건 3) 3과목의 평균이 89~80 ==> B
		// 조건 4) 3과목의 평균이 79~70 ==> C
		// 조건 5) 69이하                      ==> 재시험
		if ((avg<=100) && (avg>=90)) { 
			System.out.println("학점 A");
		} else if ((avg<=89) && (avg>=80)) {
			System.out.println("학점 B");
		} else if ((avg<=79) && (avg>=70)) {
			System.out.println("학점 C");
		} else {
			System.out.println("재시험");
		}
		// 추가조건) 각점수대별로 끝자리가 7점 이상은 + 가붙는다. 
		// 예) 98 ==> A+
		// 예) 89 ==> B+
		// 예) 79 ==> C+
		if ((avg<=100) && (avg>=90)) { 
			if (avg>=97) {
				System.out.println("학점 A+");
			} else {
				System.out.println("학점 A");
			}
		} else if ((avg<=89) && (avg>=80)) {
			if (avg>=87) {
				System.out.println("학점 B+");
			} else {
				System.out.println("학점 B");
			}
		} else if ((avg<=79) && (avg>=70)) {
			if (avg>=77) {
				System.out.println("학점 C+");
			} else {
				System.out.println("학점 C");
			}
		} else {
			System.out.println("재시험");
		}*/
			
	}

}
