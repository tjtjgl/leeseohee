package recursion;

public class RecursionMain {

	public static void function(int num) throws StackOverflowError {

		if (num == 0) {
			return;
		}

		System.out.println("반갑습니다.");
		function(num - 1);
	}
	
	//1부터 5까지 합 구하기
	public static int function2 (int num) {
		if (num == 1) {
			return 1;
		}

		return num + function2(num-1);
	}
	
	

	public static void main(String[] args) {

		/**
		 * 재귀함수: 
		 * 자기 자신을 다시 호출하여 문제를 해결해 가는 함수 (반복문으로도 가능) 
		 * 새로운 메소드가 계속 생성되어 스택을 차지! -> StackOverFlowError 
		 * 멈추는 조건문을 걸어야 함, 무한반복문 같은거
		 */
		try {
			function(5); // 5는 횟수
			System.out.println(function2(5));
		} catch (StackOverflowError e) {
			e.printStackTrace();
		}
	}

}
