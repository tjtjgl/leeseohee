package thread_wait_notify;

public class Customer implements Runnable {

	private final Dish dish;

	public Customer(Dish dish) {
		this.dish = dish;
	}

	private void eat(int i) throws InterruptedException {
		synchronized (dish) {
			while (dish.isEmpty()) {
				dish.wait();
			}
			dish.setEmpty(true);
			System.out.println(i+1 + "번째 음식을 먹었습니다. 3초");
			dish.notify();
		}
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			try {
				eat(i);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		

	}

}

