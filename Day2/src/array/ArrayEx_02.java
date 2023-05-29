package array;

import java.util.Random;

public class ArrayEx_02 {

	public static void main(String[] args) {

		// 랜덤 점심메뉴 정하기
		Random r = new Random();

		String[] m = { "마라탕", "쌀국수", "돈까스", "엽기떡볶이", "해장국", "매운갈비찜", "김치찌개", "냉면" };

		// 메뉴 개수 구하기
		int size = m.length;

		// 랜덤값 뽑기
		int lunch = r.nextInt(size); // +0 안해도 0부터

		System.out.println(m[lunch]);

	}

}
