
public class PolymorphismEx {

	public static void main(String[] args) {

		// 레퍼런스 변스 c1: 누구의 *주소*를 가지고 있는 변수
		//Car c1 = new Car();

		// 레퍼런스 변수 f1
		FireEngine f1 = new FireEngine();

		// 레퍼런스 변수 a1
		Ambulance a1 = new Ambulance();

		// 부모클래스인 Car가 만들어진 소방차(f1)를 참조(주소값을 가리킴) -> 업캐스팅
		// 부모클래스가 참조하고 있으면 부모가 물려준 변수/메소드만 접근 가능
		// 자식 클래스에 있는 내용을 접근하고 싶을 경우에는 오버라이딩
		Car c2 = f1;
		c2.drive(); // 오버라이딩 된 drive 메소드, 해당 메소드에 변수도 넣어서 변경 가능

		Car c3 = a1;
		c3.stop();

		// object 클래스, 모든 클래스의 최고 부모, 자동 상속
		//Object o1 = new Car();
		Object o2 = new FireEngine();
		Object o3 = new Ambulance();

		// 참조변수의 개수가 몇개냐
		// ex.Ambulance: 자기자신, car, object 3개

		// instanceof 연산자: 참조변수가 참조하는 인스턴스의 실제 타입을 체크
		// 참조할 수 있으면 true, 없으면 false
		boolean res = c3 instanceof Ambulance; // 객체변수 instanceof 클래스명
		System.out.println(res);
		
		String str = "이서희";
		res = str instanceof Object;
		System.out.println(res);

	}

}
