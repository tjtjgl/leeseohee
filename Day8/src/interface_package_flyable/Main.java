package interface_package_flyable;

import java.util.ArrayList;

class Bird implements Flyable {

	public void fly(String name) {
		System.out.println("<" + name + ">가 날개를 퍼덕이며 날아간다");
	}

}

class Helicopter implements Flyable {

	public void fly(String name) {
		System.out.println("<" + name + ">가 프로펠러를 힘차게 돌리며 날아간다");
	}

}

class Rocket implements Flyable {

	public void fly(String name) {
		System.out.println("<" + name + ">이 제트 엔진을 분풀하며 날아간다");
	}

}

public class Main {

	public static void main(String[] args) {

		
		Flyable b = new Bird();
		//Bird b = new Bird();
		// b.fly("새");

		Flyable h = new Helicopter();
		//Helicopter h = new Helicopter();
		// h.fly("헬리콥터");

		Flyable r = new Rocket();
		//Rocket r = new Rocket();
		// r.fly("로켓");

		ArrayList<Flyable> list = new ArrayList<>();

		list.add(b);
		list.add(h);
		list.add(r);

		list.get(0).fly("새");
		list.get(1).fly("헬리콥터");
		list.get(2).fly("로켓");
	}
}
