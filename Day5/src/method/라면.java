package method;

public class 라면 {

	public static void 라면을산다() {
		System.out.println("라면사자");
	}
	public static void 물을올린다() {
		System.out.println("물을 올리자");
	}
	public static void 면을넣는다() {
		System.out.println("면을 넣자");

	}
	public static void 스프를넣는다() {
		System.out.println("스프를 넣자");

	}
	public static void 라면완성() {
		System.out.println("라면 완성~~~");
	}

	public static void main(String[] args) {

		// 함수의 실행 순서:
		// 함수가 호출되면 해당 함수로 가서 함수 내용이 실행되고 해당 함수 실행이 끝나면 다시 메인에서 호출한 그 함수로 돌아온다.
		// main 함수야 기다려줘서 고마워. 돌아온 값은 뭐고 이제 난 끝났어. 다음으로 넘어가

		라면을산다();
		면을넣는다();
		스프를넣는다();
		라면완성();

		라면을산다();
		스프를넣는다();
		면을넣는다();
		라면완성();
	}
}
