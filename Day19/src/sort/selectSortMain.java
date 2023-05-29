package sort;

import java.util.Arrays;
import java.util.Random;

public class selectSortMain {

	static int[] nums;
	static Random r = new Random();

	public static void main(String[] args) {
		
		/**
		 * 선택정렬
		 */

		nums = new int[10];

		for (int i = 0; i < 10; i++) {
			nums[i] = r.nextInt(20) + 1;
		}

		System.out.println("정렬 전 ");
		// 배열을 관리하는 클래스에서 배열을 출력하는 toString 호출
		System.out.println(Arrays.toString(nums));

		// 선택 기준: 가장 작은 값 기준으로 정렬
		for (int i = 0; i < nums.length; i++) {
			// 가장 앞 원소를 초기값으로 설정
			// 반복진행될 때마다 min 초기화
			int minIdx = i; 

			// 탐색진행
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[minIdx] > nums[j]) {
					minIdx = j;
				}
			}

			// 탐색 완료되면 가장 작은 값을 가장 앞의 원소와 가장 작은 원소의 위치를 바꿈
			int tmp = nums[minIdx];
			nums[minIdx] = nums[i];
			nums[i] = tmp;
		}

		System.out.println("정렬 후 ");
		System.out.println(Arrays.toString(nums));

	}

}
