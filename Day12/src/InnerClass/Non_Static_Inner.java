package InnerClass;

import javax.swing.JOptionPane;

class Out {
	
	static int a = 1; // 컴파일 하는 동안 static 영역에 메모리 할당;

	static class In {

		String inFun() {
			return a + "번째 static 내부 클래스";
		}

	}
}

public class Non_Static_Inner {
	
	public static void main(String[] args) {
		String str = "";
		
		//외부클래스는 클래스명을 주고 내부클래스는 객체를 생성
		Out.In obj = new Out.In();
		
		str = obj.inFun();
		
		JOptionPane.showMessageDialog(null, str);
	}

}
