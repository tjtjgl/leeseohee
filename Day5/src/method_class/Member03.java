package method_class;

class Objection1 {

	String name;
	int pay;

}

public class Member03 {

	public static void trainPrint(Objection1 obj) {
		System.out.println("===예매정보===");
		System.out.println("목적지: " + obj.name);
		System.out.println("운임비: " + obj.pay);
	}

	public static void main(String[] args) {
		// 대구
		Objection1 o1 = new Objection1();
		o1.name = "대구";
		o1.pay = 25000;

		// 부산
		Objection1 o2 = new Objection1();
		o2.name = "부산";
		o2.pay = 40000;

		trainPrint(o1);
		trainPrint(o2);

	}

}
