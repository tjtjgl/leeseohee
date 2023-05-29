package testex;

public class Main {

	public static void main(String[] args) {

		int[] answer = { 1,2,3,3,1,2,5 };
		int[] tmplist = {};
		int size = answer.length;
		int findIdx;

		for (int i = 0; i < answer.length-1; i++) {

			if (answer[i] == answer[i + 1]) {
				tmplist = answer;
				answer = new int[--size];
				findIdx = i + 1;

				for (int x = 0, y = 0; x < tmplist.length; x++) {
					if (x != findIdx) {
						answer[y] = tmplist[x];
						y += 1;
					}
				}
			}

		}

		for (int val : answer) {
			System.out.print(val + " ");
		}
	}

}
