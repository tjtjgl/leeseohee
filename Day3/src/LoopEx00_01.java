import java.util.Scanner;

public class LoopEx00_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		int total = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("숫자 입력>");
			x = sc.nextInt();
			total += x;
			if (total >= 100)
				break;
		}
		System.out.println("총합: " + total);
	}

}
