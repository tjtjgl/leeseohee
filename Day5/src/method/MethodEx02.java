package method;

public class MethodEx02 {

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}
	
	public static double div(int a, int b) {
		return (double)a/b; //int 나누기 int 지만 강제형변환을 통해 double로 바꿔줌
	}

	public static void main(String[] args) {
		// 모든 결과값을 출력하는 건 main

		int a = 10, b = 20;
		
		int res = add(a,b);
		System.out.println(res);
		
		
		System.out.println(mul(a,b));
		System.out.println(div(a,b));

	}

}

//public static void show(int temp) { // 매개변수(파라미터) 사용하여 아래 num1값을 복사해옴, 변수명은 상관없음
//	System.out.println(temp);
//}
//
//public static int input() {
//	
//	String name = "이서희";
//	int num2 =300;
//	
//	return num2; //main에게 데이터를 보냄, num2는 int 타입이므로 함수명 앞에 자료형을 int로 작성
//	
//}
//
//public static void main(String[] args) {
//	
//	int num1 = 10;
//	
//	show(num1);
//	
//	//내가 만든 함수(input() 함수)에서 main 함수로 데이터를 이동시킴
//	System.out.println(input());
//	
//}