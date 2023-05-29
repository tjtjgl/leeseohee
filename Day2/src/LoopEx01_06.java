import java.util.Scanner;

public class LoopEx01_06 {

	public static void main(String[] args) {

		// 횟수값을 입력 받아서 횟수만큼 이름을 출력하기

		Scanner sc = new Scanner(System.in);

		int x = 1;
		
		System.out.println("횟수 입력>");
		int count = sc.nextInt();

		while (x <= count) {
			System.out.println("이서희");
			x++;
		}

	}
}
