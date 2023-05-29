import java.util.ArrayList;
import java.util.Arrays;

class Cat {
	// 필드(정보, 상태) 영역
	String name;
	String breeds;
	double weight;

	// 메소드(동작, 기능) 영역
	void claw() {
		System.out.println("할퀴기");
	}

	void meow() {
		System.out.println("야옹");
	}

}

//학생클래스
//필드이름, 학번, 배열로

class Stu {

	String name;
	int ID;
	// int[] scores = new int[3];
	ArrayList<Integer> scores = new ArrayList<>();

	// 학생의 기능(동작) 영역
	void showInfo() {
		System.out.println("이름은 " + name + "이고 학번은 " + ID + "이며 점수는 아래와 같습니다.");
		for (int val : scores) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

}

public class ClassEx02 {

	public static void main(String[] args) {

		// 고양이 객체 생성 : 생성하는 순간 !자동 초기화!
		Cat c = new Cat();

		c.name = "야오이";
		c.weight = 1.5;
		c.breeds = "먼치킨";

		System.out.println(c.name);
		System.out.println(c.weight);
		System.out.println(c.breeds);

		// 학생 객체 생성
		Stu s1 = new Stu();

		s1.name = "이서희";
		s1.scores.add(100);
		s1.scores.add(90);
		s1.scores.add(100);

		Stu s2 = new Stu();
		s2.name = "이지희";
		s2.scores.add(20);
		s2.scores.add(70);
		s2.scores.add(100);

		s1.showInfo();
		s2.showInfo();
	}
}
