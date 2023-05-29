import java.util.Scanner;

public class VectorTest {

	public static void main(String[] args) {

		// 이름을 저장하는 배열 (백터구조)
		// 학번을 저장하는 배열, 점수를 저장하는 배열
		int[] haks = null;
		int[] scores = null;
		int cnt = 0;
		int hak;
		int score;

		Scanner sc = new Scanner(System.in);
		int sel;

		while (true) {

			System.out.println("---kh정보학원---");
			System.out.println("1.학번과점수 추가");
			System.out.println("2.학번과점수 삭제");
			System.out.println("3.학번과점수 조회");
			System.out.println("4.학번과점수 파일저장");
			System.out.println("0.종료");
			sel = sc.nextInt();

			switch (sel) {
			case 1:
				if (cnt == 0) {
					haks = new int[1];
					scores = new int[1];
				} else {
					int[] tmp1 = haks;
					int[] tmp2 = scores;

					haks = new int[cnt + 1];
					scores = new int[cnt + 1];

					for (int i = 0; i < cnt; i++) {
						haks[i] = tmp1[i];
						scores[i] = tmp2[i];
					}
					// tmp는 필요 없으므로 지워주기
					tmp1 = null;
					tmp2 = null;
				}

				System.out.println("추가할 학번 입력> ");
				hak = sc.nextInt();
				haks[cnt] = hak;

				System.out.println("추가할 점수 입력> ");
				score = sc.nextInt();
				scores[cnt] = score;

				cnt += 1;

				break;

			case 2: // 삭제
				// 삭제할 공간 자체가 없을 때의 경우도 만들어주기
				if (cnt == 0) {
					System.out.println("빈 공간입니다.");
				} else {
					System.out.println("삭제할 학번 입력> ");
					hak = sc.nextInt();

					int findIdx = -1;

					for (int i = 0; i < cnt; i++) {
						if (hak == haks[i]) {
							findIdx = i;
							break;
						}

					}

					if (findIdx == -1) {
						System.out.println("삭제할 값 없음");
					} else {
						int[] tmp1 = haks;
						int[] tmp2 = scores;

						haks = new int[cnt - 1];
						scores = new int[cnt - 1];

						for (int i = 0, j = 0; i < cnt; i++) {
							if (i != findIdx) {
								haks[j] = tmp1[i];
								scores[j] = tmp2[i];
								j += 1;
							}

						}
						cnt -= 1;
					}
				}
				break;

			case 3: // 조회
				System.out.println("1) 전체 조회, 2) 학번 조회");
				int sel2 = sc.nextInt();

				if (sel2 == 1) {
					System.out.println("[전체 학생 점수 목록]");
					for (int i = 0; i < cnt; i++) {
						System.out.println(haks[i] + "번 학생의 점수는 " + scores[i] + "점 입니다.");
					}
				}

				if (sel2 == 2) {

					System.out.println("조회할 학생의 학번 입력> ");
					int hakSel = sc.nextInt();

					int scoreSel = 0;

					for (int i = 0; i < cnt; i++) {
						if (hakSel == haks[i]) {
							scoreSel = scores[i];
						}
					}
					System.out.println(hakSel + "번 학생의 점수는 " + scoreSel + "점 입니다.");

				}

				for (int val : haks) {
					System.out.print(val + " ");
				}
				System.out.println();
				for (int val : scores) {
					System.out.print(val + " ");
				}
				System.out.println();

				break;

			case 4:
				break;

			case 0:
				return;

			default:
				System.out.println("잘못 입력");

			}
		}
	}
}
