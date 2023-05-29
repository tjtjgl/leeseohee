package testex;

public class Solution {

	public int[] solution(int[] answer) {
		int[] tmplist = {};
		int size = answer.length;
		int findIdx;

		for (int i = 0; i < answer.length; i++) {

			if (answer[i] == answer[i + 1]) {
				tmplist = answer;
				answer = new int[size - 1];
				findIdx = i + 1;

				for (int x = 0, y = 0; x < answer.length; x++) {
					if (x != findIdx) {
						answer[y] = tmplist[x];
						y += 1;
					}
				}
			}

		}
		return answer;
	}

	public static void main(String[] args) {

		int[] answer = { 1,2,3,3,1,2,5 };
		new Solution().solution(answer);
		

		for (int val : new Solution().solution(answer)) {
			System.out.print(val + " ");
		}

	}

}
