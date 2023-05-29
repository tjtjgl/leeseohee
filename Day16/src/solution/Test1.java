package solution;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	Scanner sc = new Scanner(System.in);

	public int[] solution(int[] array, int[][] commands) {

		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int x = (commands[i][0]) - 1;
			int y = (commands[i][1]) - 1;
			int z = (commands[i][2]) - 1;

			if (x < y) {
				int[] tmps = new int[y - x + 1];
				int tmp = x;
				for (int j = 0; j <= (y - x); j++) {
					tmps[j] = array[tmp++];
				}

				Arrays.sort(tmps);
				answer[i] = tmps[z];

			} else if (x == y) {
				answer[i] = array[x];
			} else {
				System.out.println("자리수를 잘못 입력하였습니다.");
				answer = null;
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] cmd = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		for (int val : new Test1().solution(arr, cmd)) {
			System.out.print(val + " ");
		}

	}

}
