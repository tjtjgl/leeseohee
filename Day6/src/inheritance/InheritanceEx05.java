package inheritance;

class Cylinder {
	double radius;
	double height;
	double bottomArea;//여기서는 선언만 한 뒤 

	Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
		this.bottomArea = (3.14 * radius * radius); // 데이터를 넣고 bottomArea를 가져와야 함!

	}

	void getVolume() {
		// double bottomArea = (3.14 * radius * radius);
		double volume = this.bottomArea * this.height;

		System.out.println("원기둥의 부피: " + volume);
	}

	void getArea() {
		//double bottomArea = (3.14 * radius * radius);
		double sideArea = 2 * 3.14 * this.radius * this.height;
		double area = 2 * (this.bottomArea + sideArea);

		System.out.println("원기둥의 겉넓이: " + area);
	}
}

public class InheritanceEx05 {

	public static void main(String[] args) {

		Cylinder c1 = new Cylinder(5, 7);

		c1.getVolume();
		c1.getArea();

	}

}
