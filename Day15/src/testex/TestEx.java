package testex;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEx {
	// 입력 받은 10진수를 2진수로 변환하고 다시 10진수로 변환하기

	static void decToBin(int dec) {
		ArrayList<Integer> list = new ArrayList<>();
		int tmp = dec;
		int bin = 0;

		while (tmp != 1) {
			bin = tmp % 2;
			tmp /= 2;
			list.add(bin); // 거꾸로 넣는 중
		}

		list.add(tmp);

		for (int i = list.size() - 1; i > -1; i--) {
			System.out.print(list.get(i));
		}
	}

	static int binToDec(int bin) {
		int dec = 0;

		return dec;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("십진수 입력 : ");
		int val = sc.nextInt();
		decToBin(val);
//		System.out.println("이진수 : " + val);
//		val = binToDec(val);
//		System.out.println("십진수 : ");
	}

}
