package thread_wait_notify;

public class Cook implements Runnable {

	private final Dish dish; // 객체 생성과 동시에 저장, 변경 불가

	public Cook(Dish dish) {
		this.dish = dish;
	}

	private void cook(int i) throws InterruptedException { // i 몇번째 음식인지, 함부로 접근 못하도록 주방자의 고유 권한
		synchronized (dish) {
			while (!dish.isEmpty()) {
				dish.wait(); // 음식을 먹을 때 까지 기다린다
			}
			dish.setEmpty(false);
			System.out.println(i+1 + "번째 음식이 준비 되었습니다. 5초");
			dish.notify();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				cook(i);
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
