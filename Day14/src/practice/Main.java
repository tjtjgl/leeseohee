package practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static Random r = new Random();

	public static void main(String[] args) {
//		new Main().practice1();
//		new Main().practice2();
//		new Main().practice3();
//		new Main().practice4();
//		new Main().practice5();
//		new Main().practice6();
//		new Main().practice7();
//		new Main().practice8();
//		new Main().practice9();
//		new Main().practice10();
//		new Main().practice11();
//		new Main().practice12();
//		new Main().practice13();
//		new Main().practice14();
//		new Main().practice15();
		new Main().practice16();
	}

	// 문제1
	public void practice1() {

		int[] list = new int[10];
		for (int i = 0; i < list.length; i++) {
			list[i] = ++i;
		}
		for (int val : list) {
			System.out.print(val + " ");
		}

	}// 1 끝

	// 문제2
	public void practice2() {

		int[] list = new int[10];
		int num = list.length;
		for (int i = 0; i < list.length; i++) {
			list[i] = num--;
		}
		for (int val : list) {
			System.out.print(val + " ");
		}

	}// 2 끝

	// 문제3
	public void practice3() {

		System.out.println("배열의 크기를 입력하세요> ");
		int arr = sc.nextInt();

		int[] list = new int[arr];

		for (int i = 0; i < list.length; i++) {
			list[i] = i + 1;
		}
		for (int val : list) {
			System.out.print(val + " ");
		}

	}// 3 끝

	// 문제4
	public void practice4() {

		String[] list = { "사과", "귤", "포도", "복숭아", "참외" };

		for (int i = 0; i < list.length; i++) {
			if (list[i].equals("귤")) {
				System.out.println(list[i]);
			}
		}
	}// 4 끝

	// 문제5
	public void practice5() {

		System.out.println("문자열을 입력하세요> ");
		String str = sc.next();

		System.out.println("문자을 입력하세요> ");
		char ch = sc.next().charAt(0);

		int size = str.length();
		char[] list = new char[size];

		for (int i = 0; i < size; i++) {
			list[i] = str.charAt(i);
		}
		int cnt = 0;
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스): ");
		for (int i = 0; i < list.length; i++) {
			if (list[i] == ch) {
				System.out.print(i + " ");
				cnt += 1;
			}
		}
		System.out.println();
		System.out.println(ch + " 개수: " + cnt);
	}// 5 끝

	// 문제6
	public void practice6() {

		String[] weeks = { "월", "화", "수", "목", "금", "토", "일" };

		System.out.println("0~6 사이 숫자 입력> ");
		int num = sc.nextInt();

		if (num > -1 && num < weeks.length) {
			System.out.println(weeks[num] + "요일");
		} else
			System.out.println("잘못 입력하였습니다.");

	}// 6 끝

	// 문제7
	public void practice7() {

		System.out.println("배열의 크기를 입력하세요> ");
		int num = sc.nextInt();

		int[] numList = new int[num];

		int sum = 0;

		for (int i = 0; i < numList.length; i++) {
			System.out.println(i + "번째 인덱스에 넣을 값: ");
			numList[i] = sc.nextInt();
			sum += numList[i];
		}

		for (int val : numList) {
			System.out.print(val + " ");
		}
		System.out.println();

		System.out.println("총 합 : " + sum);

	}// 7 끝

	// 문제8
	public void practice8() {
		
		System.out.println("3 이상인 정수를 입력하세요> ");
		int num = sc.nextInt();
		
		int[] list = new int[num];
		if(num > 2 && (num%2==1)) {
			boolean maxline = true;
			
			for(int i=0; i < list.length; i++) {
				
			}
			
			
			
			
			
			
		}
		

	}// 8 끝

	// 문제9
	public void practice9() {

		String[] chickens = { "양념", "후라이드", "황금올리브", "허니콤보", "뿌링클" };

		System.out.println("치킨 이름을 입력하세요> ");
		String ck = sc.next();

		boolean res = true;

		for (int i = 0; i < chickens.length; i++) {
			if (ck.equals(chickens[i])) {
				break;
			} else {
				res = false;
			}
		}

		if (res) {
			System.out.println(ck + "치킨 배달 가능");
		} else {
			System.out.println(ck + "치킨은 없는 메뉴입니다.");
		}

	}// 9 끝

	// 문제10
	public void practice10() {

		System.out.println("주민등록번호를 입력하세요> ");
		String str = sc.next();
		char[] RRN = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			RRN[i] = str.charAt(i);
			char[] tmp = RRN.clone();
			if (i < 8) {
				System.out.print(RRN[i]);
			} else {
				tmp[i] = '*';
				System.out.print(tmp[i]);
			}
		}
	}// 10 끝

	// 문제11
	public void practice11() {
		int[] lst = new int[10];

		for (int i = 0; i < lst.length; i++) {
			lst[i] = r.nextInt(10) + 1;
		}

		for (int val : lst) {
			System.out.print(val + " ");
		}
	}// 11 끝

	// 문제12
	public void practice12() {
		int[] lst = new int[10];

		for (int i = 0; i < lst.length; i++) {
			lst[i] = r.nextInt(10) + 1;
		}

		Arrays.sort(lst);

		int maxNum = lst[lst.length - 1];
		int minNum = lst[0];

		for (int val : lst) {
			System.out.print(val + " ");
		}

		System.out.println("\n최대값: " + maxNum + "\n최소값: " + minNum);
	}// 12 끝

	// 문제13 - 난수 중복없이 저장하기
	public void practice13() {

	}// 13 끝

	// 문제14 - 로또(난수) 중복없이 저장하기
	public void practice14() {

	}// 14 끝

	// 문제15 - 문자열 중복 없애기
	public void practice15() {

	}// 15 끝

	// 문제16
	public void practice16() {

		boolean run = true;

		System.out.println("배열 크기 입력> ");
		int size = sc.nextInt();

		String[] list = new String[size];

		for (int i = 0; i < list.length; i++) {
			System.out.println((i + 1) + "번째 문자열 입력> ");
			list[i] = sc.next();
		}

		while (run) {
			System.out.println("추가하시겠습니까? (1)네, (2)아니요(종료)");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				System.out.println("몇개를 더 추가하시겠습니까?");
				int cnt = sc.nextInt();
				String[] tmp = list;

				list = new String[size + cnt];

				for (int i = 0; i < size; i++) {
					list[i] = tmp[i];
				}

				for (int i = 0; i < cnt; i++) {
					System.out.println("추가할 문자열 입력> ");
					list[size++] = sc.next();
				}
				break;

			case 2:
				for (String val : list) {
					System.out.print(val + " ");
				}
				run = false;
				break;
			}
		}
	}// 16 끝

}
