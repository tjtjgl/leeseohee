package method;

import java.util.Scanner;

public class MethodEx02_01 {

	// 하나의 정수를 스캐너로 받아서 제곱하는 함수 만들기
	// 입력 () 정수, 함수명 sq, return
	
	public static int sq(int inputNum) {

		int res=0;

		for (int i = 0; i < inputNum; i++) {
			res = inputNum * inputNum;
		}

		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("제곱할 숫자를 입력");
		int x = sc.nextInt();

		System.out.println(x +"의 제곱 값은 " + sq(x) + " 입니다.");

	}

}
