package control;

import java.util.Scanner;

public class ifEx05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//문제1
//		나이를 Scanner 입력 받아서 나이가 20세 미만 "소아청소년" 20세 이상 "성인"
//		나이를 입력 받고 20세 미만 " 할인율 10% 입니다"출력 30세 미만 " 할인율 20% 입니다" 30세 이상 " 할인율 5% 입니다"


		System.out.println("나이 입력>");
		int age=sc.nextInt();
		
		if(age < 20 ) {
			System.out.println("소아청소년");
			System.out.println("할인율 10%");
		}else {	
			System.out.println("성인");
			if (age <30) {
				System.out.println("할인율 20%");
			} else {
				System.out.println("할인율 5%");
			}
		}
		
		//문제2
//		놀이기구 이용제한 
//		1. 키를 입력받는다. 
//		2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
//		3. 키가 120 미만이면, 놀이기구를 이용할 수 없다. 
//		4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다. 예) 부모님과 함께오셨나요?(yes:1, no:0) 1번누르면 "부모님과 동반 탑승가능" 2번 " 탑승불가"

		
		System.out.println("키 입력>");
		int h=sc.nextInt();
		
		if(h >= 120 ) {
			System.out.println("놀이기구를 이용할 수 있습니다.");
		} else {
			System.out.println("놀이기구를 이용할 수 없습니다.");
			System.out.println("단, 부모님과 같이 오셨나요: yes:1, no:0");
			
			int answer=sc.nextInt();
			
			if(answer == 1) {
				System.out.println("부모님과 탑승 가능");
			} else {
				System.out.println("탑승 불가");
				}
			}
		}
}
