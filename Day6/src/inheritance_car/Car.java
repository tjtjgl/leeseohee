package inheritance_car;

public class Car {
	// 현대자동차
	String brandName = "현대자동차";
	String carName;
	int maxSpeed;
	String grade;
	String color;

	void carDrive() {
		System.out.println("달린다");
	}

	void carBreak() {
		System.out.println("멈춘다");
	}
	
	void carBackup() {
		System.out.println("후진한다");
	}

}

class Avante extends Car {

}

class Grandeur extends Car {
	
}

class Genesis extends Car {
	
	void massage() {
		System.out.println("안마기능");
	}
	
}


