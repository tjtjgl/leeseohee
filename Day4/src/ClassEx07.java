class Hero {

	String name;
	int hp;

	Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	void showInfo() {
		System.out.println(name + "(hp: " + hp + ")");
	}

}

public class ClassEx07 {

	public static void main(String[] args) {

		Hero h1 = new Hero("아이언맨", 80);
		Hero h2 = new Hero("타노스", 160);
		Hero h3 = new Hero("토르", 150);
		Hero h4 = new Hero("그루트", 40);

		h1.showInfo();
		h2.showInfo();
		h3.showInfo();
		h4.showInfo();

	}

}
