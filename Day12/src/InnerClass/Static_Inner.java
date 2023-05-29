package InnerClass;

import javax.swing.JOptionPane;

class Out1 {

	int a = 1; // 컴파일 하는 동안 static 영역에 메모리 할당;

	class In {

		String inFun() {
			return a + "번째 static 내부 클래스";
		}

	}
}

public class Static_Inner {

	public static void main(String[] args) {
		String str = "";

		Out1 out = new Out1();
		Out1.In in = out.new In();

		str = in.inFun();

		JOptionPane.showMessageDialog(null, str);
	}

}
