import java.util.Scanner;

public class ArrayEx05_01 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		
		

		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}

		for (int[] num : arr) { // 행 한줄 전체 출력
			for (int num2 : num) {
				System.out.print(num2 + " ");
			}
			System.out.println();
		}
		
/*
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예1) 인덱스1 입력 : 1 인덱스2 입력 : 2
		// 값 출력 : 60

		

		System.out.println("행 입력> ");
		int x = sc.nextInt();
		System.out.println("열 입력> ");
		int y = sc.nextInt();

		System.out.println(arr[x][y]);

		// ======================================================

		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예 2) 값 입력 : 60
		// 인덱스1 출력 : 1 인덱스2 출력 : 2

		System.out.println("값 입력> ");
		int num = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == num) {
					System.out.println("인덱스1 출력: " + i + "," + "인덱스2 출력: " + j);
				}
			}
		}
*/
		// 문제 3 ) 값 2개를 입력 받아 교체
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 값 입력> ");
		int num1 = sc.nextInt();

		System.out.println("두번째 값 입력> ");
		int num2 = sc.nextInt();

		int x1=0;
		int y1=0;
		int x2=0;
		int y2=0;
		int tmp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == num1) {
					x1 = i;
					y1 = j;
				}
				if (arr[i][j] == num2) {
					x2 = i;
					y2 = j;
				}
			}
		}
		tmp=arr[x2][y2];
		arr[x2][y2]=arr[x1][y1];
		arr[x1][y1]=tmp;
		
		for (int[] num3 : arr) { // 행 한줄 전체 출력
			for (int num4 : num3) {
				System.out.print(num4 + " ");
			}
			System.out.println();
		}	
			

	}

}
