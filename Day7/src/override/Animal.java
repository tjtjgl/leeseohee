package override;

public class Animal {
	// 모든 동물
	void cry() {
		System.out.println("?");
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("야옹야옹");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}
