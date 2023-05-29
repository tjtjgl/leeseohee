package inheritance;

class person {

	String name;
	int age;
	int height;
	double weight;
	char blood;

	void eat() {
		System.out.println("먹는다");
	}

	void play() {
		System.out.println("논다");
	}

	void sleep() {
		System.out.println("잔다");
	}

}

class 캡틴 extends person {
	void 방패공격() 
	{
	System.out.println("방패막기");
	}
}

class 아이언맨 extends person {
	void 한손공격() 
	{
	System.out.println("한손빔");
	}
}

class 토르 extends person{
	void 번개공격() 
	{
	System.out.println("망치번개");
	}
}

class 위도우 extends person{
	void 숨기공격() 
	{
	System.out.println("안보인다");
	}
}

public class InheritanceEx01_01 {

	public static void main(String[] args) {
		캡틴 캡1 = new 캡틴();
		캡1.방패공격();
		
		아이언맨 아1 = new 아이언맨();
		아1.한손공격();

		토르 톨1 = new 토르();
		톨1.번개공격();
		
		위도우 위1 = new 위도우();
		위1.숨기공격();
	}

}
