import java.util.Random;
import java.util.Scanner;

public class LoopGame {

	public static void main(String[] args) {

		// 구구단 게임 5회 반복, 정답 맞추면 20점, 게임 종료 후 출력
		Scanner sc = new Scanner(System.in);

		// 랜덤(로또 임의의 수를 하나 뽑는다)
		Random r = new Random();

		// nextInt(개수) + 시작 수 1부터 3까지 3개 중 하나를 뽑는다
		// System.out.println(r.nextInt(3)+1);

		int count = 1;
		int total = 0;
		// 또는 맞춘 개수 변수 생성하여 마지막에 토탈 곱하기 맞춘개수로 출력해도 됨

		// 5번 반복
		while (count != 6) {
			// 2단~9단 하나 뽑고 1~9 하나 뽑고
			int x = r.nextInt(8) + 2;
			int y = r.nextInt(9) + 1;

			int ans = x * y;

			System.out.println(x + "x" + y + "=");
			System.out.println("정답은?");

			int my_ans = sc.nextInt();

			if (my_ans == ans) {
				System.out.println("정답");
				total += 20;

			}

			count++;

		}

		System.out.println("성적: " + total + "점");

	}

}
