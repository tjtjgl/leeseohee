import java.util.Random;
import java.util.Scanner;

public class LoopEx01_03 {

	public static void main(String[] args) {
//		Up & Down 게임[2단계]
//				 * 1. com 은 랜덤으로 1~100사이를 저장한다.
//				 * 2. me 는 1~100사이를 입력한다. 	 
//				 * 3. com 과 me 를 비교해서 com 크면 "크다" , com 이작으면 "작다" 힌트제공 
//				 * 4. 정답을 맞추면 게임은 종료된다.
//				 *    단! 100점 틀릴 때마다 5점 감소! 0이 되면 게임종료!
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int x = r.nextInt(100) + 1;
		// System.out.println(x); 정답보기

		int my_x = 0;
		int score = 100;

		while (my_x!=x ||score != 0) {
			System.out.println("숫자 입력>");
			my_x = sc.nextInt();
			if (my_x < x) {
				System.out.println("업");
				score -= 5;
			} else if (my_x > x) {
				System.out.println("다운");
				score -= 5;
			} else {
				System.out.println("정답");
				break;
			}
		}
		System.out.println("내 점수는 " + score + "점");

	}

}
