import java.util.Scanner;

public class VectorEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 정수
		int[] arr = null; // 비어있는 배열 선언

		int cnt = 0; // 데이터 개수
		int sel; // 메뉴 선택
		// 1. 추가, 2. 삭제, 3.정렬(조회), 0.종료

		while (true) {
			System.out.println("1)추가 2)삭제 \n3)조회 0)종료");
			sel = sc.nextInt();

			switch (sel) {
			case 1:// 추가
				if (cnt == 0) { // 기존 데이터가 있는지 없는지 cnt로 확인, 0이면 배열 생성
					arr = new int[1];
				} else { // 0이 아니면 기존 데이터 저장 후 추가
					int[] tmp = arr;
					arr = new int[cnt + 1]; // 입력 받을 공간 하나를 추가해라

					for (int i = 0; i < cnt; i++) {
						arr[i] = tmp[i]; // 공간 생성한 배열에 데이터 복사
					}

					// 기존 배열 필요없으므로 삭제(null)
					tmp = null;

				}
				System.out.println("추가할 값 입력>");
				int dataAdd = sc.nextInt();
				arr[cnt++] = dataAdd; // !cnt 증가 필수!
				break;

			case 2: // 삭제
				if (cnt == 0) {
					System.out.println("빈 공간");
				} else {
					// 삭제 할 데이터의 인덱스 찾기
					System.out.println("삭제할 값 입력>");
					int dataDel = sc.nextInt();
					int idxDel = -1;

					for (int i = 0; i < cnt; i++) {
						if (arr[i] == dataDel) {
							idxDel = i;
							break;
						}
					}

					if (idxDel == -1) {
						System.out.println("삭제할 값이 존재하지 않습니다.");
					} else {
						int[] tmp = arr;
						arr = new int[cnt - 1]; // 삭제값 공간은 빼고 생성

						for (int i = 0, j = 0; i < cnt; i++) {// j: 새로운 배열의 인덱스번호, 같지 않을 경우엔 증가 하면 안되니까
							if (i != idxDel) {
								arr[j++] = tmp[i]; // 공간 생성한 배열에 데이터 복사
							}

						}

					}
				}
				break;

			case 3:
				// 전체 조회
				for (int val : arr) {
					System.out.print(val + " ");
					System.out.println(cnt);
				}
				System.out.println();
				break;
				
			case 0:
				return; // break switch문 종료, *main함수* 종료

			default: // 예외처리
				System.out.println("잘못 입력함");
			}

		}

	}

}
