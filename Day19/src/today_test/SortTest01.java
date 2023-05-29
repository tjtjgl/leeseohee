package today_test;

import java.util.Random;

public class SortTest01 {

	public static void main(String[] args) {

		Random r = new Random();

		int minIdx;

		int cnt = r.nextInt(15) + 1;
		System.out.println(cnt);

		System.out.println("정렬 전: ");

		int[] list = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			list[i] = r.nextInt(cnt) + 1;
			for (int j = 0; j < i; j++) {
				if (list[i] == list[j]) {
					list[i] = r.nextInt(cnt) + 1;
					j = -1;
				}
			}
			System.out.println(list[i]);
		}

		for (int i = 0; i < list.length; i++) {
			minIdx = i;

			for (int j = i + 1; j < list.length; j++) {
				if (list[minIdx] > list[j]) {
					minIdx = j;
				}
			}

			int tmp = list[minIdx];
			list[minIdx] = list[i];
			list[i] = tmp;

		}

		System.out.println("정렬 후: ");
		for (int val : list) {
			System.out.println(val);
		}
	}

}
