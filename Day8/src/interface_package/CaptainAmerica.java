package interface_package;

public class CaptainAmerica implements Hero{
	
	private  int hp = Hero.maxHP; //static으로 선언되어 있기 때문에 인터페이스명으로 접근 가능
	
	@Override
	public void attack() {
		System.out.println("캡틴아메리카 공격");
	}

	@Override
	public void heal(int portion) {
		hp += portion;
		if (hp > Hero.maxHP) {
			hp = Hero.maxHP;
		}
		System.out.println("캡틴아메리카가 " +portion + "만큼 체력 회복 완료");
	}

	void muster() {
		System.out.println("어벤저스 멤버 소집");
	}
}
