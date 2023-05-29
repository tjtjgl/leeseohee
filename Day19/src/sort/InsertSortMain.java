package sort;

import java.util.Arrays;
import java.util.Random;

public class InsertSortMain {

	static int[] nums;
	static Random r = new Random();

	public static void main(String[] args) {
		/**
		 * 삽입정렬 - 값을 하나하나 비교해서 앞 데이터와 비교해서 작으면 왼쪽, 크면 오른쪽 초기 정렬에 되어 있지 않음 가장 첫번째 원소는
		 * 정렬되어 있는 상태다 가정하고 시작 자료 배열의 모든 요소를 차례대로 이미 정렬된 배열의 부분과 비교하여 자신의 위치를 찾아서 삽입
		 * 
		 * 기본 정렬-삽입,선택,버블 
		 * 고급 정렬-퀵,병합,셀,힙
		 */

		nums = new int[10];

		for (int i = 0; i < 10; i++) {
			nums[i] = r.nextInt(20) + 1;
		}

		System.out.println("정렬 전 ");
		System.out.println(Arrays.toString(nums));

		for (int i = 1; i < nums.length; i++) {
			// 현재 선택된 원소의 값을 임시 변수에 저장
			int tmp = nums[i];

			// 현재 원소를 기준으로 이전 원소를 탐색하기 위한 idx 변수
			int prev = i - 1;

			// 현재 선택된 원소가 이전 원소보다 작은 경우까지만 반복
			while (prev >= 0 && nums[prev] > tmp) {
				// 현재 선택된 원소가 현재 탐색중인 원소보다 작으면 밀어버리기
				nums[prev + 1] = nums[prev];

				// 다음 원소 탐색
				prev--;
			}
			// 탐색이 종료된 지점에 현재 선택되어 있던 변수의 값을 삽입
			nums[prev + 1] = tmp;

		}

		System.out.println("정렬 후 ");
		System.out.println(Arrays.toString(nums));

	}

}
