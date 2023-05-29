package string_object2_equals_overriding;

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		// 만약 현객체 this 와 매개변수 객체가 같을 경우 true
		if (this == obj) {
			return true;
		}

		// 만약 같은 클래스(Person) 타입이 아니면 에러
		//false 는 객체랑 관계가 없다
		if (!(obj instanceof Person)) {
			return false;
		}
		
		//이제 비교 시작
		//obj를 Person으로 다운캐스팅
		Person p = (Person) obj;
		if(p.name == this.name) {
			return true;
		} else return false;
		
	}
}

public class Main {

	public static void main(String[] args) {

		Person a1 = new Person("이서희");
		Person a2 = new Person("이서희");

		if ((a1).equals(a2)) {
			System.out.println("같다");
		} else
			System.out.println("다르다");

	}

}
