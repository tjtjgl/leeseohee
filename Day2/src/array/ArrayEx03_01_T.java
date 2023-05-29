package array;

public class ArrayEx03_01_T {

	public static void main(String[] args) {

		int[] IDs = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 100, 54, 60, 63 };

		// 1등 학생의 학번과 성적 출력

		int index =1;
		int max = scores[0]; 
		int findIdx = -1;

		
		while (index < scores.length) {
			
			if(max < scores[index]) {
				max = scores[index];
				findIdx = index;
			}
			
			index +=1;
		}
		
		System.out.println("학생 ID: " + IDs[findIdx]);
		System.out.println("학생 점수: " + scores[findIdx]);
		
	}

}