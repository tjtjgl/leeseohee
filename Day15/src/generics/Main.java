package generics;

//람다 표현식
//일반변수를 객체화 시켜주는 래퍼클래스
//자동으로 포장

interface IAdd<T> {
	
	public T add(T x , T y);

}


//인터페이스 추상 메소드들의 제네릭 타입 지정 가능
//인터페이스 객체 생성 X
//1회용 익명 클래스(내부클래스 중)

interface I_Sample<T> {

	public void addElement(T t, int idx);

	public T getElement(int idx);
}

class Sample<T> implements I_Sample<T> {

	private T[] array;

	public Sample() {
		array = (T[]) new Object[10];
	}

	
	@Override
	public void addElement(T t, int idx) {
		array[idx] = t; //t 타입으로 들어온 객체의 주소를 저장

	}

	@Override
	public T getElement(int idx) {
		return array[idx];
	}

}

public class Main {

	public static void main(String[] args) {
		
		Sample<String> sa = new Sample<>();
		
		sa.addElement("This is string", 5);
		
		System.out.println(sa.getElement(5));
		
		//매개변수 x와 y, 반환형 타입이 int형으로 설정된다.
		
		IAdd<Integer> o = (x,y) -> x+y;
		
		//포장한걸 int에 다시 저장
		int res = o.add(10, 20);
		
		System.out.println(res);

	}
}

//void method() {
////		T t = new T(); -> new 연산자 뒤에 제네릭 타입의 파라미터는 올 수 없음
//}
//
////	static 멤버는 클래스가 동일하게 공유하는 변수로서 제네릭 객체가 생성되기 전에 이미 자료형이 결정되어 있어야 함
////	public static T addAge(int n) { }
//
////제네릭으로 배열 선언 시, 기본적으로 제네릭 클래스 자체는 배열로 만들 수 없음
////		new Sample<>[10];
//
////제네릭으로 배열을 선언하고 싶을 때
//Sample<Integer>[] list = new Sample[10];
//
//list[0] = new Sample<Integer>();
//
//list[1] = new Sample<>();