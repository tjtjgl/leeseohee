package method;

public class 김밥천국 {

	public static String 주방장(String 이모님) {
		String 메뉴 = 이모님;

		System.out.println("주문이 들어왔습니다.");
		System.out.println("요리를 만드는 중");
		System.out.println(메뉴 + "가 완성되었습니다.");

		return 메뉴;
	}

	public static void main(String[] args) {
		// main은 나
		// 내가 주문 -> 이모=메뉴가 주방장에게 전달 -> 주문한 음식 나옴

		주방장("라볶이");

	}
}
