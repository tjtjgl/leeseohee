package control;

import java.util.Scanner;

public class ifEx05_02 {

	public static void main(String[] args) {
//		구구단 게임[1단계] 
//		1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
//		2. 입력받은 숫자를 토대로 구구단 문제를 출력한다. 
//		예) 3 x 7 = ? 3. 문제에 해당하는 정답을 입력받는다. 
//		4. 정답을 비교 "정답" 또는 "땡"을 출력한다.

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자1 입력>");
		int num1 = sc.nextInt();
		System.out.println("숫자2 입력>");
		int num2 = sc.nextInt();

		int res = num1 * num2;

		System.out.println(num1 + " X " + num2 + " = ?");
		int me_res = sc.nextInt();

		if (me_res == res) {
			System.out.println("정답");
		} else {
			System.out.println("땡");
		}
	}
}
