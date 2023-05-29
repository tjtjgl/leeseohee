package inheritance;

class A {
	int num;

	// 기본생성자가 없을 때
	A(int num) {
		this.num = num;
		System.out.println("A클래스 : " + num);
	}
}

//부모 클래스에 생성자가 생기면 부모변수를 초기화해서 자식클래스에 줘야 함
class B extends A {
	B(int num) {
		super(num);
		System.out.println("B클래스 : " + num);
	}
}

class Personal {

	String name;
	int age;

	Personal(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

class Student extends Personal {

	Student(String name, int age) {
		super(name, age);
	}

	void study() {
		System.out.println(name + "(" + age + ")" + "가 공부한다");
	}
}

class Teacher extends Personal {

	Teacher(String name, int age) {
		super(name, age);
	}

	void lecture() {
		System.out.println(name + "(" + age + ")" + "선생님이 강의한다");
	}

}

public class InheritanceEx02 {

	public static void main(String[] args) {

		B b1 = new B(10);

		System.out.println(b1.num);

		Student s1 = new Student("이서희", 20);
		s1.study();

		Teacher t1 = new Teacher("이서희", 30);
		t1.lecture();

	}

}
