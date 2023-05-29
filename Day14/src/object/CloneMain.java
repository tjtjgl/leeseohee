package object;

public class CloneMain {

	public static void main(String[] args) {

		// clone(): 객체를 복사해서 새로운 인스턴스(객체 생성)
		// 일반 변수: 값 그대로 복사 가능
		// 참조 변수: 주소를 복수

		// 얇은 복사:
		// 깊은 복수:

		User u1 = new User("test01", "1234");
		// User u2 = u1; 주소값이 같아짐, 대입이 아니라 같은 주소를 바라보고 있는 것

		try {
			//clone()을 public으로 재정의하여 사용 가능	
			//반환타입이 Object 이므로 다운캐스팅
			User u2 = (User) u1.clone();

			System.out.println(u1 + ", " + u2);
			
			System.out.println(u1.getId());
			System.out.println(u2.getId());
			System.out.println(u1.getPw());
			System.out.println(u2.getPw());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
