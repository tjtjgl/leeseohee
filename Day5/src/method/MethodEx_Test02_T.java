package method;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx_Test02_T {

	public static int maxNum(int[] nums) {

		// 배열 길이 확인
		int size = nums.length;
		return nums[size - 1];

	}

	public static int minNum(int[] nums) {

		return nums[0];

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 정수 입력>");
		int x = sc.nextInt();

		System.out.println("두번째 정수 입력>");
		int y = sc.nextInt();

		System.out.println("세번째 정수 입력>");
		int z = sc.nextInt();

		int[] nums = new int[3];

		nums[0] = x;
		nums[1] = y;
		nums[2] = z;

		Arrays.sort(nums);
	}

}
