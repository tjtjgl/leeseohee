package SuperMario;

import java.util.Random;

public class Coopa implements Runnable {

	// 목숨이 여러 인스턴스들을한테 공유!
	static int hp = 1000;
	String name;
	String 공격명;
	int level;
	int time;

	public Coopa() {
		this.name = "쿠파";
		this.level = 30;
		this.공격명 = "불기둥";
	}

	@Override
	public void run() {
		Random r = new Random();
		int temp; // 랜덤값을 저장
		
		while (true) {
			this.time = r.nextInt(1000, 3000);
	
			try {
				Thread.sleep(this.time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.공격명 + " 공격!");
			
			
		}
	}
}
