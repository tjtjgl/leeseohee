
//상속은 물려만 줌
//꼭 구현해야 하는 강제성은 없음

public abstract class Car {

	String color;
	int door;

	// 강제성 O
	abstract void drive();

	abstract void stop();

	abstract void 와이퍼();

	// 강제성 X
	void 썬루프() {}

	void 블루투스() {}

}

class FireEngine extends Car {

	int a;

	@Override
	void drive() {
		a = 1000;
		System.out.println(a);
		water();
	}

	void water() {
		System.out.println("물 뿌리는 기능");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	void 와이퍼() {
		// TODO Auto-generated method stub

	}

}

class Ambulance extends Car {

	@Override
	void stop() {
		siren();

	}

	void siren() {
		System.out.println("삐용비용환자이송");
	}

	@Override
	void drive() {
		// TODO Auto-generated method stub
	}

	@Override
	void 와이퍼() {
		// TODO Auto-generated method stub
	}

}
