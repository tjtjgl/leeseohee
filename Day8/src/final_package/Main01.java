package final_package;

class Company{
	final String name = "kh회사";
	
	final void print () {
	System.out.println(name);	
	}
	
	//매개변수 값 변경 X
	void setInfo(final int tmp) {}
}

// 클래스가 final로 선언 시 상속 불가
class Company_SBS extends Company{
	
	//부모클래스의 메소드가 final일 경우 자식클래스에서 오버라이딩 불가
	//private void print() {}
}

public class Main01 {

	public static void main(String[] args) {
		//객체 생성 시 final
		final Company c1 = new Company();
		
		Company_SBS sbs = new Company_SBS();
		sbs.print();
		
		//c1 = new Company(); 객체 생성했다면 재생성은 불가능
		//c1.name = "다른회사";	//객체 안 변수(필드)는 변경 가능
	}
}
