package starcraft;


public class StarCraft {
	//종족(테란,프로토스,저그)
	
	//다른 패키지에서 아래 클래스 쓰려면 퍼블릭 클래스에서 생성
	public Tanker t = new Tanker(3000);
	public Marine m = new Marine(500);
	public Dropship d = new Dropship(5000);
	
	public void show() {
		
		System.out.println("탱커: " + t.hp);
		System.out.println("마린: " + m.hp);
		System.out.println("드랍쉽: " + d.hp);
	}
	
}

//인터페이스 : 표시만 해주는 것 
class 테란 extends StarCraft{}
class 프로토스 extends StarCraft{}
class 저그 extends StarCraft{}


abstract class Unit{
	
	//공격하는 애들
	final int maxhp;
	int hp;
	int x,y;
	
	Unit(int maxhp){
		this.maxhp =maxhp;
		this.hp=maxhp;
				
	}
	
	abstract void attack();
	abstract void move();
}

class Marine extends Unit{
	Marine(int maxhp) {
		super(maxhp);
	}
	@Override
	void attack() {
	}
	@Override
	void move() {
	}
}

class Tanker extends Unit{
	Tanker(int maxhp) {
		super(maxhp);
	}
	@Override
	void attack() {
	}
	@Override
	void move() {
	}
}

class Dropship extends Unit{
	Dropship(int maxhp) {
		super(maxhp);
	}
	@Override
	void attack() {
	}
	@Override
	void move() {
	}
}
