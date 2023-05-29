package starcraft2;

//마커인터페이스
//상속관계가 아닌 클래스들을 그룹화 시킬 수 있음
interface Medical {} // 사람만 *표시*

interface Repairable {} // 기계만 *표시*

public class StarCraft2 {}

//인터페이스 : 표시만 해주는 것 
class 테란 extends StarCraft2 {}

class 프로토스 extends StarCraft2 {}

class 저그 extends StarCraft2 {}

abstract class Unit {

	// 공격하는 애들
	final int maxhp;
	int hp;
	int x, y;

	Unit(int maxhp) {
		this.maxhp = maxhp;
		this.hp = maxhp;
	}

	abstract void attack();

	abstract void move();
}

class Marine extends Unit implements Medical {
	Marine(int maxhp) {
		super(maxhp);
	}

	@Override
	void attack() {}

	@Override
	void move() {}
}

class Tanker extends Unit implements Repairable {
	Tanker(int maxhp) {
		super(maxhp);
	}

	@Override
	void attack() {}

	@Override
	void move() {}
}

class Dropship extends Unit implements Repairable {
	Dropship(int maxhp) {
		super(maxhp);
	}

	@Override
	void attack() {}

	@Override
	void move() {}
}

class Doctor extends Unit {

	Doctor(int maxhp) {
		super(maxhp);
	}

	void heal(Unit u) {
		System.out.println("사람만 고친다.");

		boolean res = u instanceof Medical;

		if (res) {
			while (u.hp <= u.maxhp) { // 고치는 중 ~
				System.out.println(u.hp++);
				try {Thread.sleep(100); // 프로그램 지연시키는 함수, 단위 ms
				} catch (InterruptedException e) {}
			}
			System.out.println("치료완료");
		}
	}

	@Override
	void attack() {
	}

	@Override
	void move() {
	}
}

class SCV extends Unit implements Repairable {

	SCV(int maxhp) {
		super(maxhp);
	}

	void repair(Repairable r) {
		System.out.println("기계만 고친다.");
		Unit u = (Unit) r; // 형변환~

		while (u.hp <= u.maxhp) { // 고치는 중 ~
			System.out.println(u.hp++);
			try {Thread.sleep(100); // 프로그램 지연시키는 함수, 단위 ms
			} catch (InterruptedException e) {}
		}
		System.out.println("수리완료");
	}

	@Override
	void attack() {}

	@Override
	void move() {}
}
