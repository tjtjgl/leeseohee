package com.kh.practice.numRange.controller;

import java.util.Scanner;

public class NumberController {

	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		if (num1 <= 100 && num1 > 0 && num2 <= 100 && num2 > 0) {
			System.out.print(num1 + "은(는) " + num2 + "의 배수인가? ");
			if (num1 % num2 == 0) {
				return true;
			} else
				return false;
		} else {
			throw new NumRangeException("1부터 100 사이의 값이 아닙니다.");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		NumberController a = new NumberController();

		try {
			System.out.println("첫번째 정수 입력>");
			int num1 = sc.nextInt();
			System.out.println("두번째 정수 입력>");
			int num2 = sc.nextInt();

			System.out.println(a.checkDouble(num1, num2));

		} catch (NumRangeException e) {
			System.err.println(e);
		}
	}
}
