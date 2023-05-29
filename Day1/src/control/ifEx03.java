package control;

import java.util.Scanner;

public class ifEx03 {

	public static void main(String[] args) {

		//성적 60점 이상 합격
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수>");
		int score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("합격");
		} 

		if(score <60) {
			System.out.println("불합격");
		}
		
		sc.close();
		
//		=========================================================
		//if문으로 ID/PW 입력 (정수 4자리)
		//입력값과 db데이터를 비교해 로그인 처리, 로그인 성공 또는 실패
		
		//기존 id,pw
		int id=1111;
		int pw=2222;
		
		//현재 로그인하는 id,pw
		int now_id=1111;
		int now_pw=2221;
		
		//id부터 비교
		//패스워드까지 맞으면 로그인 성공
//		if (id==now_id) {
//			if(pw==now_pw) {
//				System.out.println("로그인 성공");			
//			}else {
//				System.out.println("아이디 또는 패스워드가 다릅니다.");
//			}
//		} else {
//			System.out.println("아이디가 다릅니다.");
//		}
		
		//논리연산자로 간단화
		if (id==now_id && pw==now_pw) {
			System.out.println("로그인 성공");			
		}else {
			System.out.println("아이디 또는 패스워드가 다릅니다.");
			}
		}
		

}
