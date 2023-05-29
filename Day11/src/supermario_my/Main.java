package supermario_my;

import java.util.ArrayList;
import java.util.Random;

class Character extends Thread {
	String name;
	int level;
	int hp;
	int time;

	public Character(String name, int hp, int level, int time) {
		this.name = name;
		this.hp = hp;
		this.level = level;
		this.time = time;
	}

	int attack() {
		Coopa.hp -= level;
		if (Coopa.hp <= 0) {
			System.out.println("쿠파를 물리쳤습니다!");
//			stop();

		}
		return Coopa.hp;
	}
}

class Mario extends Character {

	public Mario(String name, int hp, int level, int time) {
		super(name, hp, level, time);
	}

	@Override
	synchronized int attack() {
		super.attack();
		System.out.println(name + "가 " + this.level + "만큼 펀치공격!" + Coopa.hp);
		return Coopa.hp;

	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.attack();
		}
	}
}

class Luigi extends Character {

	public Luigi(String name, int hp, int level, int time) {
		super(name, hp, level, time);
	}

	@Override
	synchronized int attack() {
		super.attack();
		System.out.println(name + "가 " + this.level + "만큼 폭탄 공격!" + Coopa.hp);
		return Coopa.hp;
	}

	@Override
	public void run() {
		while(true) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.attack();
		}
	}
}

class Peach extends Character {

	public Peach(String name, int hp, int level, int time) {
		super(name, hp, level, time);
	}

	@Override
	synchronized int attack() {
		super.attack();
		System.out.println(name + "가 " + this.level + "만큼 물건던지기 공격!" + Coopa.hp);
		return Coopa.hp;
	}

	@Override
	public void run() {
		while(true) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.attack();
		}
	}
}

class Mushroom extends Character {

	public Mushroom(String name, int hp, int level, int time) {
		super(name, hp, level, time);
	}

	@Override
	synchronized int attack() {
		super.attack();
		System.out.println(name + "가 " + this.level + "만큼 버섯던지기 공격!" + Coopa.hp);
		return Coopa.hp;
	}

	@Override
	public void run() {
		while(true) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.attack();
		}
	}
}

class Coopa extends Thread {
	String name;
	int level;
	static int hp = 1000;
	int time;

	public Coopa(String name, int level, int time) {
		this.name = name;
		this.level = level;
		this.time = time;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(this.time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + "가 " + level + "만큼 불기둥 공격!");
	}
}

public class Main {
	public static void main(String[] args) {

		Random r = new Random();
		// 이름,레벨,목숨,공격타임
		Character mario = new Mario("Mario", 300, 35, 1100);
		Character luigi = new Luigi("Luigi", 300, 30, 1500);
		Character peach = new Peach("Peach", 300, 30, 1000);
		Character mushroom = new Mushroom("Mushroom", 300, 35, 1600);

		ArrayList<Character> chars = new ArrayList<>();
		chars.add(mario);
		chars.add(luigi);
		chars.add(peach);
		chars.add(mushroom);
		
		ArrayThread list = new ArrayThread(chars);
		Thread thread = new Thread(list);
		
		

		for (int i = 0; i < chars.size(); i++) {
			chars.get(i).setDaemon(true);
		}

		//int x = r.nextInt(4);
		thread.start();

		for (int i = 0; i < 100000; i++) {
			System.out.println("쿠파 죽이는 중");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (Coopa.hp <= 0)
				break;
		}

	}

}
