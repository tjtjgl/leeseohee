

public class ArrayEx05 {

	public static void main(String[] args) {

		//2차원 배열
		int[][] arr = new int[5][2]; //[행][열]

		double[][] school = new double[3][5];
		
		int[][] arr2 = { //3행 4열
				{1,2,3,4},
				{4,5,6,4},
				{7,8,9,4}
				};
		
		//2차원 배열의 길이는 *행 개수*
		System.out.println(arr2.length);
		
		//전체 출력
		for(int i=0; i<arr2.length ; i++) {
			for(int j=0; j <4 ; j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
		
		for(int[] num : arr2) { //행 한줄 전체 출력
			for(int num2 : num) {
				System.out.print(num2);
			}
			System.out.println();
		}
		
		//부분출력, 배열명[행][열]
		System.out.println(arr2[2][2]);
	}

}
