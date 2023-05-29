package abstract_package;

public abstract class Shape {
	abstract void draw();
}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("원을 그린다");
	}
}

class Square extends Shape {

	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
}

class Line extends Shape {
	void draw() {
		System.out.println("원을 그린다");
	}
}
