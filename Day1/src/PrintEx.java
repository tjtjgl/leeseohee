
public class PrintEx {

	public static void main(String[] args) {

		/*
		System.out.println();
		
		System.out.println(10 * 10);
		System.out.println(10 / 5);
		System.out.println(10 % 2);
		

		System.out.println("프로그램 끝");

		System.out.println("2-2는 "+ (2-2) +" 입니다.");
		*/
		//문제0. 백준알고리즘 단계별테스트
		System.out.println("[문제0]");
		System.out.println("Hello World!");
		System.out.println("1+2="+(1+2));
		System.out.println("3-2="+(3-2));
		System.out.println("7/3의 몫="+(7/3));
		System.out.println("7/3의 나머지="+(7%3));
		System.out.println();
				
		//문제1. 월급이 150만원일 때 연봉 12개월 계산하기
		System.out.println("[문제1]");
		System.out.printf("세전 연봉: "+(150.00*12) +"만원");
		System.out.println("세후 연봉: "+(double)(150.00*12-((150*12)*0.1))+"만원");
		System.out.println();
		
		//문제2. 시험점수 30,50,40점 평균
		System.out.println("[문제2]");
		System.out.println("평균 점수: "+ ((30+40+50)/3) + "점");
		System.out.println();
		
		//문제3. 100초를 1분 40초로 출력
		System.out.println("[문제3]");
		System.out.println((100/60)+"분 " + (100%60) +"초");

		//문제4. 
	}

}
