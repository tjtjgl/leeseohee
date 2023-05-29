package com.kh.practice.comp.func;

import java.util.ArrayList;
import java.util.Scanner;

public class CompExample {
	Scanner sc = new Scanner(System.in);

	// 실습문제1.
	public void practice1() {
		System.out.println("정수를 입력하세요>");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("양수가 아닙니다.");
		} else {

			for (int i = 1; i < num + 1; i++) {
				if (i % 2 == 1) {
					System.out.print("박");
				} else if (i % 2 == 0) {
					System.out.print("수");
				}
			}
		}
	}// 1 끝

	// 실습문제2.
	public void practice2() {
		boolean run = true;

		while (run) {
			System.out.println("정수를 입력하세요>");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("양수가 아닙니다.");

			} else {
				for (int i = 1; i < num + 1; i++) {
					if (i % 2 == 1) {
						System.out.print("박");
					} else if (i % 2 == 0) {
						System.out.print("수");
					}
				}
				run = false;
			}
		}
	}// 2 끝

	// 실습문제3.
	public void practice3() {
		int cnt = 0;

		System.out.println("문자열 입력> ");
		String inputText = sc.next();
		System.out.println("검색 문자 입력> ");
		String idxText = sc.next();

		int size = inputText.length();

		for (int i = 0; i < size; i++) {
			char tmp = inputText.charAt(i);
			if (tmp == idxText.charAt(0)) {
				cnt += 1;
			}
		}

		System.out.println(inputText + "에 포함된 " + idxText + " 개수: " + cnt);
	} // 3 끝

	// 실습문제4.
	public void practice4() {
		int cnt = 0;
		boolean run = true;

		while (run) {
			System.out.println("문자열 입력> ");
			String inputText = sc.next();
			System.out.println("검색 문자 입력> ");
			String idxText = sc.next();

			int size = inputText.length();

			for (int i = 0; i < size; i++) {
				char tmp = inputText.charAt(i);
				if (tmp == idxText.charAt(0)) {
					cnt += 1;
				}
			}
			System.out.println(inputText + "에 포함된 " + idxText + " 개수: " + cnt);

			System.out.println("더 하시겠습니까?> Y(y) or N(n)");
			char sel = sc.next().charAt(0);

			switch (sel) {
			case 'Y': case 'y':
				run = true;
				break;
			case 'N': case 'n':
				run = false;
				break;

			}
		}
	}// 4 끝
}
