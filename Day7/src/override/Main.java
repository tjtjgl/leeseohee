package override;

public class Main {

	public static void main(String[] args) {
		Square sq1 = new Square("정사각형");
		sq1.x = 5;
		sq1.area();

		Triangle tr1 = new Triangle("삼각형");
		tr1.x = 5;
		tr1.hei = 3;
		tr1.area();

		Circle ci1 = new Circle("원");
		ci1.r = 5;
		ci1.area();

		Shape sh1 = sq1;
		Shape sh2 = tr1;
		Shape sh3 = ci1;

		Shape[] list = { sh1, sh2, sh3 };

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}

class Shape {
	String name;
	double area;

	public Shape(String name) {
		this.name = name;

	}

	double area() {
		return area;
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + ", area=" + area + "]";
	}

}

class Square extends Shape {
	int x;

	public Square(String name) {
		super(name);
	}

	double area() {
		area = this.x * this.x;
		return area;
	}

}

class Triangle extends Shape {
	int x;
	int hei;

	public Triangle(String name) {
		super(name);
	}

	double area() {
		area = this.x * this.hei;
		return area;
	}

}

class Circle extends Shape {
	int r;

	public Circle(String name) {
		super(name);
	}

	double area() {
		area = this.r * 3.14;
		return area;
	}
}
