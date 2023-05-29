package thread_wait_notify;

public class Main {

	public static void main(String[] args) {
		
		final Dish d = new Dish();
		//Coustomer s = new Customer(d);
		// Thread t = new Thread(s);
		// t.start(); 
		new Thread(new Customer(d)).start();
		new Thread(new Cook(d)).start();
		
		


	}

}

