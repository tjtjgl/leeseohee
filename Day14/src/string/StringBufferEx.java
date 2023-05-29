package string;

public class StringBufferEx {
	
	static void showstrbu2() {
		
		String str = "abcdefg";
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb);
		
		//문자열 자르기(추출) substring(시작,끝)
		
		//문자열 중간에 추가하기
		sb.insert(2, "사이");
		System.out.println("추가: " +sb);
		
		//삭제
		sb.delete(3, 5);
		System.out.println("삭제: " +sb);
		
		//뒤집기 reverse()
		
		//버퍼사이즈 설정 및 확인
		StringBuffer sb3 = new StringBuffer(80);
		System.out.println(sb3.capacity());
		
		//길이확인 length()
		
		//문자열 치환 replace()
	
		
		
		//대문자로 변환
		String str3 = "abcd";
		System.out.println(str3.toUpperCase());
		
	}
	
	
	

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" world");
		sb.append("!");
		String result = sb.toString();
		
		System.out.println(result);
		System.out.println(sb.hashCode());
		System.out.println(result.hashCode());
		
		
		String str4 = new StringBuffer("오와 ").append("계속 ").append("이어 ").append("붙이기").toString();
		System.out.println(str4);
		
		showstrbu2();

	}

}
