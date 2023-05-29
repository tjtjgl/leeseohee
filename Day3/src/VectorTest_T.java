import java.util.Scanner;

public class VectorTest_T {

	public static void main(String[] args) {

		int[] hakbun = null;
		int[] score = null;

		int count = 0; // 배열 체크카운트 생성
		int select;

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("---kh정보학원---");
			System.out.println("1.학번과 점수를 추가");
			System.out.println("2.학번과 점수를 삭제");
			System.out.println("3.학번과 점수를 조회");
			System.out.println("4.학번과 점수를 파일저장");
			System.out.println("0.종료");

			select = input.nextInt();

			// 2, 3 기준은 학번을 기준!
			// 조회 -> 학번을 조회하면 1. 전체출력 2. 조회하는 학번의 내용 출력

			switch (select) {

			case 1:

				if (count == 0) {
					hakbun = new int[1];
					score = new int[1];
				} else { // 새로 생성한 배열에 기존 배열 데이터 옮기기

					int[] new_h = hakbun;
					int[] new_s = score;

					hakbun = new int[count + 1];
					score = new int[count + 1];

					for (int i = 0; i < count; i++) {
						hakbun[i] = new_h[i];
						score[i] = new_s[i];
					}
					new_h = null;
					new_s = null;
				}
				System.out.println("추가할 학번을 우선 입력해주세요.>");
				int data_h = input.nextInt();
				hakbun[count] = data_h;

				System.out.println("추가할 점수를 입력해주세요.>");
				int data_s = input.nextInt();
				score[count] = data_s;

				count += 1;

				break;

			case 2:

				if (count == 0) {
					System.out.println("빈 공간입니다. 더이상 삭제하실 수 없습니다.");
				} else {
					System.out.println("삭제하고자 하는 학번을 입력해주세요.");
					int delete_h = input.nextInt();

					int delete_Index = -1;

					for (int i = 0; i < count; i++) {
						if (delete_h == hakbun[i]) {
							delete_Index = i;
							break;
						}
					}

					if (delete_Index == -1) { // 삭제할 데이터가 없을 때
						System.out.println("삭제하고자 하는 학번이 존재하지 않습니다.");
					} else { // 삭제할 데이터가 있을 때

						int[] new_h = hakbun;
						int[] new_s = score;

						hakbun = new int[count - 1];
						score = new int[count - 1];

						for (int i = 0, j = 0; i < count; i++) {

							if (i != delete_Index) {
								hakbun[j] = new_h[i];
								score[j] = new_s[i];
								j += 1;
							}
									
						}
						new_h = null;
						new_s = null;

						count -= 1;
					}
				}

				break;

			case 3:
				System.out.println("1.전체 조회하기\n2.선택하여 조회하기");
				select = input.nextInt();

				switch (select) {

				case 1:

					if (count == 0) {
						System.out.println("조회하실 데이터가 없습니다.");
						System.out.println();
					} else {
						for (int view_hakbun : hakbun) {
							System.out.print("학번 " + view_hakbun + " ");
						}
						System.out.println();
						for (int view_score : score) {
							System.out.print("점수 " + view_score + " ");
						}
						System.out.println();
					}
					System.out.println();
					break;

				case 2:
					System.out.println("조회하고자 하는 학번을 입력해주세요.>");
					int find_h = input.nextInt();

					int find_Index = -1;

					for (int i = 0; i < count; i++) {
						if (hakbun[i] == find_h) {
							System.out.println(hakbun[i] + "의 점수는 " + score[i] + "점 입니다.");
							System.out.println();
							break;
						} else {
							System.out.println("조회 하신 학번은 존재하지 않습니다.");
							System.out.println();
						}
					}
				}
				break;

			case 4:
				break;

			case 0:
				System.out.println("프로그램이 종료됩니다.");
				return;

			default:
				System.out.println("번호를 잘못 선택하셨습니다.");
				break;
			}
		}
	}

}
