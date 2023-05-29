package GUI;

public class Main{

	public static void main(String[] args) {
		
		Thread thread = new Thread(new MyFrame_T2());
		thread.start();

	}

}
