package array;

import java.util.Scanner;

public class Array04_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 10, 20, 0, 0, 0 };
		int count = 2;
		int totalSize = arr.length;

		while (true) {
			System.out.println("현재 남은 공간: " + (totalSize - count));
			System.out.println("1.추가 2.삭제 0.종료 >");
			int sel = sc.nextInt();

			if (sel == 1) {
				// 공간이 남아있니? 없다면 종료
				// 정수 입력 받고 데이터 개수 증가
				if (count != 5) { // 선생님 조건문 if((totalSize - count) > 0

					System.out.println("추가할 숫자 입력> ");
					int add = sc.nextInt();
					arr[count++] = add; // line33 count+=1; 말고 여기서 증가 시키기

					// 현재 저장된 배열값 출력하기
					for (int i = 0; i < arr.length; i++) {
						System.out.print(arr[i] + " ");
					}
					// count+=1;
				} else {
					System.out.println("더 이상 저장할 공간이 없습니다. 프로그램을 종료합니다.");
					break;
				}

			} else if (sel == 2) {
				// 삭제할 값의 인덱스 번호를 찾아서 새로운 배열로 삭제 인덱스 번호 빼고 복사
				int del = sc.nextInt();
				// del 값이 오디 있는지 찾고
				int findDelIdx = -1;

				// 새 배열 5개 생성해서 기존값 넣어주고 
				int[] tmp = arr;
				
				arr[0]=0;
				
				int j = 0;

				// findDelIdx 빼고 복사
				for (int i = 0; i < count; i++) {
					if(count == 0) {break;}
					
					if (i != findDelIdx) {
						arr[j] = tmp[i]; //arr 는 삭제값은 넣지 않으므로 인덱스번호 증가시키지 않음
						j += 1;
					}
				}
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}

			} else if (sel == 0)
				break;
			else
				System.out.println("0,1,2만 선택 가능");

		}

	}

}
