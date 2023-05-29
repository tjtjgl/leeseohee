package sort;

import java.util.Arrays;
import java.util.Random;

public class selectSortMain2 {

	static int[] nums;
	static Random r = new Random();

	public static void main(String[] args) {

		nums = new int[10];

		for (int i = 0; i < 10; i++) {
			nums[i] = r.nextInt(20) + 1;
		}

		System.out.println("정렬 전 ");
		System.out.println(Arrays.toString(nums));

		// 뒤에서부터 정렬
		for (int i = nums.length-1; i > 0; i--) {
			int maxIdx = i; 

			// 가장 큰 값 탐색진행
			for (int j = 0; j <= i-1; j++) {
				if (nums[maxIdx] < nums[j]) {
					maxIdx = j;
				}
			}

			// 탐색 완료되면 가장 작은 값을 가장 앞의 원소와 가장 작은 원소의 위치를 바꿈
			int tmp = nums[maxIdx];
			nums[maxIdx] = nums[i];
			nums[i] = tmp;
		}

		System.out.println("정렬 후 ");
		System.out.println(Arrays.toString(nums));

	}

}
