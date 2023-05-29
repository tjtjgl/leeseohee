

public class MyException extends Exception{
	
	String msg;
	
	public MyException(String msg) {
		//super(msg); //부모클래스가 객체를 생성할 때 내 메세지 전달
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return "MyException 발생: " + msg;
	}

	public static void main(String[] args) {

	}

}
