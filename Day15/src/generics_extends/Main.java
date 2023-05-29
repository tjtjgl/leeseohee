package generics_extends;

import java.util.ArrayList;

class Unit{}

class Stu1 extends Unit implements Readable,Closeable {
	String name;
}

class Stu2 {
	String name;
}

class Stu3 implements Closeable {
	String name;
}

//!클래스 명부터 작성 후 인터페이스 붙여야 함!
class School <T extends Unit & Readable & Closeable> {
	String name;
}


//T 제네릭 타입을 정하고 제한을 주지 않으면 이상한 객체 타입으로 선언
//숫자 중 정수와 실수만 들어오도록 제한하기(!Number 클래스만!)
//타입 한정 키워드 extends 관련있는 타입들만 객체 타입으로 지정할 수 있다

class Calc<T extends Number> {
	void add(T a, T b) {}
	void min(T a, T b) {}
	void mul(T a, T b) {}
	void div(T a, T b) {}
}

//와일드카드
//class Calc2<T super Number> {
//	void add(T a, T b) {}
//	void min(T a, T b) {}
//	void mul(T a, T b) {}
//	void div(T a, T b) {}
//}

public class Main {

	public static void main(String[] args) {
	
		// Number클래스를 상속받은 타입들은 객체 타입지정이 가능하다.
		Calc<Number> c1 = new Calc();
		Calc<Integer> c2 = new Calc();
//		Calc<String> c3; 안된다!
//		Calc<Object> c4; 안된다
		
		School<Stu1> s1;
//		School<Stu2> s2; 안된다
//		School<Stu3> s3; 안된다
		
		ArrayList<Stu1> list = new ArrayList<>();
		list.add(new Stu1());
//		list.add(new Stu2()); 안되구요
		
		
		
	}
}
