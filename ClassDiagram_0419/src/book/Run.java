package book;

public class Run {

	public static void main(String[] args) {
		
		try {
			new BookMenu().mainMenu();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
