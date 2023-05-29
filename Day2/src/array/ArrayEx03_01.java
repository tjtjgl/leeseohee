package array;

public class ArrayEx03_01 {

	public static void main(String[] args) {

		int[] IDs = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 100, 54, 60, 63 };

		// 1등 학생의 학번과 성적 출력

		int max; // int max = score[0]; 으로 만들어줘야 반복문에서 첫번째는 생략할 수 있음, i=1
		int ID;
		int score = 0;
		int findIdx = -1;

		for (int i = 0; i < IDs.length; i++) {
			max = scores[i];
			if (score < max) {
				score = max;
				findIdx = i;
			}
		}

		System.out.println("학생 ID: " + IDs[findIdx]);
		System.out.println("학생 점수: " + scores[findIdx]);

	}

}
