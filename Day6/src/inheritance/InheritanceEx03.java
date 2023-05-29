package inheritance;

class Animal {
	String name;

	void cry() {
		System.out.println("운다");
	}
}

class Pet extends Animal {
	int age;
	String price;

	@Override
	public String toString() {
		return "Pet [age=" + age + ", price=" + price + "]";
	}

	void play() {
		System.out.println("논다!");
	}
}

public class InheritanceEx03 {

	public static void main(String[] args) {

		Pet p1 = new Pet();

		p1.name = "강아지";
		p1.age = 3;
		p1.price = "220만원";

		System.out.println(p1);
		System.out.println("name: " + p1.name + ", age: " + p1.age + ", 입양비용: " + p1.price);
		p1.cry();
		p1.play();

	}

}
