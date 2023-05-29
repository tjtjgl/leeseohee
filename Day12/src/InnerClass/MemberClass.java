package InnerClass;

class Outer1{ //외부 클래스
	private int num = 0;
	
	 class Member{
		 void add(int n) { num += n; }
		 int get() { return num; }
	 } 
}

public class MemberClass {

	public static void main(String[] args) {
		
		//외부 클래스 생성
		Outer1 out1 = new Outer1();
		Outer1 out2 = new Outer1();
		
		//내부 클래스 생성
		//먼저 만들어진 객체에 접근
		Outer1.Member in1 = out1.new Member();
		Outer1.Member in2 = out2.new Member();
		
		in1.add(600);
		System.out.println(in1.get());
	}
}
