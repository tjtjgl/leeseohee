package totalex;

import java.util.ArrayList;
import java.util.Scanner;

public class KakaoBank2 implements kakao {

	static Scanner sc = new Scanner(System.in);

	private static ArrayList<kakao> list = new ArrayList<>();

	void insert(String accNum, String name) {
		list.add(new Account(accNum, name));

		System.out.println("등록된 정보는 아래와 같습니다.\n=================");
		System.out.println("계좌번호: " + accNum);
		System.out.println("계좌번호: " + name);
	}

	public static void main(String[] args) throws MyException {

		while (true) {
			try {
				System.out.println("1)계좌등록, 2) 계좌조회, 3)고객 정렬, 0) 종료");
				int sel = sc.nextInt();

				switch (sel) {
				case 1:
					System.out.println("계좌번호 입력> ");
					String  accNum = sc.next();
					System.out.println("이름 입력> ");
					String name = sc.next();
					
					new KakaoBank2().insert(accNum,name);
					
					break;
				case 2:
					System.out.println("현재 고객 정보입니다.\n");
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
						System.out.println("=================");
					}
					break;

				case 3:
					System.out.println("현재 고객 정보를 오름차순으로 정렬합니다.");
					System.out.println("3초 정도 소요됩니다. 잠시만 기다려 주세요...");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
					}

//					for (int i = 0; i < list.size(); i++) {
//					Arrays.sort(list.get(i).idNew);
//					}

					System.out.println("정렬완료!");
					break;

				case 0:
					System.out.println("프로그램을 종료합니다.");
					return;

				default:
					throw new MyException("메뉴 번호를 잘못 입력하였습니다.");
				}//switch문 끝
			} catch (MyException e) {
				System.out.println("에러 발생: " + e);
			}
			
		}//while문 끝
	}
}