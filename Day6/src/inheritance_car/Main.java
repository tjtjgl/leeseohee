package inheritance_car;

public class Main {

	public static void main(String[] args) {
		Avante av1 = new Avante();
		av1.carName = "아반떼";
		av1.color = "흰색";
		av1.maxSpeed = 200;
		System.out.println(av1.brandName + ", " + av1.color + ", " + av1.carName + ", " + av1.maxSpeed);

		Grandeur gr1 = new Grandeur();
		gr1.carName = "그랜저";
		gr1.color = "검정색";
		gr1.maxSpeed = 260;
		System.out.println(gr1.brandName + ", " + gr1.color + ", " + gr1.carName + ", " + gr1.maxSpeed);


		Genesis ge1 = new Genesis();
		ge1.carName = "제네시스";
		ge1.color = "회색";
		ge1.maxSpeed = 300;
		System.out.println(ge1.brandName + ", " + ge1.color + ", " + ge1.carName + ", " + ge1.maxSpeed);
		ge1.massage();


	}

}
