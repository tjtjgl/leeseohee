package variable;

public class GalaxyTest {

	public static void main(String[] args) {

//		IPhone p1 = new IPhone();
//		IPhone p2 = new IPhone();
//		IPhone p3 = new IPhone();

		IPhone[] plist = new IPhone[5];
//		plist[0] = p1;
//		plist[1] = p2;
//		plist[2] = p3;

		for (int i = 0; i < plist.length; i++) {
			plist[i] = new IPhone(); // 값이 다 같으니까 반복문으로!
		}

		for (IPhone val : plist) {
			val.print();
		}

		System.out.println("========================");
		System.out.println("아이폰 개수: " + IPhone.cnt);

	}
}

class IPhone {

	static int cnt;
	String serialNum;

	public IPhone() {
		IPhone.cnt++;
		char c = randomAlphabet(); // A ~ Z 중 택1
		this.serialNum = String.format("%c-%d", c, IPhone.cnt);

	}

	char randomAlphabet() {
		return (char) ('A' + Math.random() * 26); // A to Z
	}

	void print() {
		System.out.printf("IPhone { serialNum: %s }\n", serialNum);
	}

}