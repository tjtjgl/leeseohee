
public class Monster extends Thread {

	String name;
	int time;

	public Monster(String name, int time) {
		this.name = name;
		this.time = time;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "가 " + (int)(time*0.001) + "초 마다 출몰합니다. "+(i+1)+"회 출몰 중..");
		}
	}
}
