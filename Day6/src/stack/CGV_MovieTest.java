package stack;

class _ArrayStack {
	int top; // 마지막 데이터가 어디인지 알려주는 방번호(인덱스)
	int size; // 스택 배열의 크기
	User[] stack;

	// ArrayStack() {}

	_ArrayStack(int size) {

		this.size = size;
		stack = new User[size]; // 값에 따라 배열 개수가 달라지도록
		top = -1;

	}

	// 추가
	void push(User item) {
		stack[++top] = item;
		System.out.println(stack[top] + " push");

	}

	// 삭제
	void pop() {
		if (top >= 0) {
			User pop = stack[top];
			System.out.println(pop + " pop");
			stack[top--] = null;
		} else
			System.out.println("더이상 삭제 할 값이 없습니다.");
	}

	// 가장 마지막 값 조회
	void peek() {
		System.out.println(stack[top] + " peak!");

	}

	// 가장 마지막 값부터 처음값까지 조회
	void peek2() {
		int peek = top;
		for (int i = peek; i >= 0; i--) {
			System.out.print(stack[peek--] + " peak!" + " ");
		}
		System.out.println();
	}
}

class User {
	// 고객정보
	String id;
	String pw;
	String phone;
	String email;

	// 예매정보를 저장하는 변수
	Reservation res = new Reservation();

	User(String id, String pw, String phone, String email) {
		this.id = id;
		this.pw = pw;
		this.phone = phone;
		this.email = email;
	}

	void showInfo() {
		System.out.println(id +", "+ pw + ", "+ phone + ", "+ email);
		res.showInfo();
	}

}

// 예매정보
class Reservation {

	String movie_name; // 영화이름
	String movie_time; // 영화시간
	int number_people; // 인원수
	String moive_room; // 몇 관인지 저장

	void setInfo(String movie_name, String movie_time, int number_people, String moive_room) {
		this.movie_name = movie_name;
		this.movie_time = movie_time;
		this.number_people = number_people;
		this.moive_room = moive_room;
	}
	
	void showInfo() {
		System.out.println(movie_name +", "+ movie_time + ", "+ number_people + "명, "+ moive_room);
	}
	
}

public class CGV_MovieTest {

	public static void main(String[] args) {

		// 저장하는 메모리 공간인 Stack 생성(5명)
		_ArrayStack s1 = new _ArrayStack(5);

		// User 생성
		User u1 = new User("seohee", "1234", "01038593561", "seohee@naver.com");

		// 저장
		s1.push(u1);
		System.out.println(s1.top);

		// user1이 웅남이 98분 2명 5관 예매
		s1.stack[s1.top].res.setInfo("웅남이", "98분", 2, "2관");
		u1.showInfo();                      

	}

}
