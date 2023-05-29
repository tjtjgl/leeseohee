package array;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {

		// 검색하기
		int[] IDs = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 100, 60, 94 };

		Scanner sc = new Scanner(System.in);

		System.out.println("학번 입력>");
		int ID = sc.nextInt();

		int findIdx = -1; // 없는 학번일 때를 대비한 변수, 맞으면 인덱스 값이 해당 변수에 저장, 안맞으면 그대로 -1=false

		for (int i = 0; i < IDs.length; i++) {
			if (ID == IDs[i]) {
				// System.out.println(scores[i]);
				findIdx = i;
				break;
			}
		}

		if (findIdx != -1) {
			System.out.println(scores[findIdx]);
		} else {
			System.out.println("찾는 학번이 없습니다.");
		}
	}

}
