package method;

public class 은행 {

	//하나의 객체를 누구나 접근 static
	
	public static String 은행원 (String 용무, String 신분증) {
		System.out.println("고갱님의 정보를 조회 중입니다~~");
		System.out.println(용무+ "는 필요한 서류가 있습니다.");
		
		return "필요한 서류 이거이거이거를 가져오세요";
		
	}
	
	public static void main(String[] args) {

		//대출업무
		//은행원
		
		String 필요서류 = 은행원("대출","신분증제출");
		
		System.out.println(필요서류);
		
	}

}
