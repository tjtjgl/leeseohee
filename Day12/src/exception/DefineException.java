package exception;

class MyException extends Exception {
	
	String str1;
	
	public MyException(String str2) {
		str1 = str2;
	}
	
	@Override
	public String toString() {
		return "MyException 발생: " + str1;
	}
	
}
public class DefineException  {

	public static void main(String[] args) {
		
		try {
			System.out.println("try 블록입니다.");
			throw new MyException("MyException 클래스가 호출됩니다.");	
		} catch (MyException e) {
			System.out.println(e);
		}
	}

}
