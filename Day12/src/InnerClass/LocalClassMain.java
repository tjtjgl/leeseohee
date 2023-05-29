package InnerClass;

class Student {

	String name;
	int math, eng, kor;

	public Student(String name, int math, int eng, int kor) {
		this.name = name;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}

	void score() {
		int total = 3;
		class Avg {
			int sum = math + eng + kor;

			void grade() {
				//total =4; 메소드 안의 클래스 함수에서 메소드 지역변수의 값 변경 불가(상수 취급)
				System.out.println(sum / total);
			}
		}
		Avg a1 = new Avg();
		a1.grade();
	}
}

public class LocalClassMain {

	public static void main(String[] args) {
		Student s1 = new Student("이서희", 100, 100, 99);
		s1.score();
	}
}
