package today_test;

import java.util.Scanner;

public class RecursionTest {

	static int function(int num) {

		if (num == 1) {
			return 1;
		}

		return num * function(num - 1);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력>");
		System.out.println(function(sc.nextInt()));

	}

}
