package interface_package;

//interface 인터페이스명
//인터페이스의 멤버: final, 추상메소드 만 가능 -> 객체 생성 불가

interface Alarm {
	// public static final 생략가능
	int num = 0;

	// 비프음, 음악재생
	void beep(); // 인터페이스에는 추상메소드만 가능하기 때문에 굳이 표기안해줘도 됨
	void playMusic();

}

interface Phone {
	void call();
	void ring();
}

interface Messenger {
	void sendMsg();
	void recMsg();
}

class SmartPhone implements Alarm, Phone, Messenger {

	@Override
	public void beep() {
		System.out.println("삐삐삐-");
		System.out.println(num);
	}

	@Override
	public void playMusic() {
		System.out.println("딴딴딴~");
	}

	@Override
	public void sendMsg() {
		System.out.println("보내기");
	}

	@Override
	public void recMsg() {
		System.out.println("받기");
	}

	@Override
	public void call() {
		System.out.println("전화건다");
	}

	@Override
	public void ring() {
		System.out.println("전화온다");
	}

}

public class Main1 {

	public static void main(String[] args) {
		// 다형성
		SmartPhone s1 = new SmartPhone();

		// 인터페이스 -> 자신이 멤버로 가지고 있는 메소드,상수에만 접근 가능
		// 오버라이딩을 통해 접근 가능해짐
		Alarm a1 = s1;
		Messenger m1 = s1;
		Phone p1 = s1;

	}

}
