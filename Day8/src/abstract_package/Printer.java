package abstract_package;

abstract public class Printer {

	// 기능: 출력 -> 상속했을때 제조사 상관없이 무조건(강제성) 구현되어야 하는 기능
	// 추상메소드 = 구현부가 없음 = 비정상적 메소드 
	// => 추상메소드 하나라도 있으면 비정상적인 클래스로, 클래스에도 abstract 붙여줘야 함
	abstract void print();

}

class Samsung_Printer extends Printer{
	//1. 오버라이딩 하던지
	@Override
	void print() {
		System.out.println("삼성프린터");
	}
	
	//2. 비정상 클래스이기 때문에 추상 클래스로 변경하던지
	
}

abstract class LG_Printer extends Printer{
	//1. 오버라이딩 하던지
	//2. 비정상 클래스이기 때문에 추상 클래스로 변경하던지
}

