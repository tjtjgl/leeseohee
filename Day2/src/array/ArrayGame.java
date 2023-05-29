package array;

import java.util.Scanner;

public class ArrayGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 유저 2, 공백 0
		int[] game = { 0, 0, 0, 0, 2, 0, 0, 0, 0 };

		// 게임 화면을 출력

		int size = game.length;

		int player = 4; // 유저가 들어있는 인덱스 번호 저장

		while (true) {
			for (int index = 0; index < size; index++) { // !index 값 0으로 초기화 필요!
				if (game[index] == 0) {
					System.out.print("__ ");
				} else {
					System.out.print("옷 ");
				}
			}
			System.out.println();
			System.out.println("왼쪽[1], 오른쪽[2]> ");

			int move = sc.nextInt();

			if (move == 1) { // 왼쪽 이동
				if (player != 0) { // 맨끝일때 움직이기 못하게
					// 기존 유저 인덱스 번호는 공백으로 바꿔주고
					game[player] = 0;
					game[player - 1] = 2;
					player -= 1;
				}
			} else if (move == 2) {
				if (player+1 < game.length ) { //왜 플레이어 +1 인지 다시 보기
					
					// 기존 유저 인덱스 번호는 공백
					game[player] = 0;
					game[player + 1] = 2;
					player += 1;
				}
			} else if (move == 0) {
				System.out.println("종료");
				break;
			}
		}
	}

}
