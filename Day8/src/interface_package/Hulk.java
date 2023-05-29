package interface_package;

public class Hulk implements Hero{

	private  int hp = Hero.maxHP; //static으로 선언되어 있기 때문에 인터페이스명으로 접근 가능
	
	@Override
	public void attack() {
		System.out.println("헐크 주먹공격");
	}

	@Override
	public void heal(int portion) {
		hp += portion;
		if (hp > Hero.maxHP) {
			hp = Hero.maxHP;
		}
		System.out.println("헐크가 " +portion + "만큼 체력 회복 완료");
	}

	void jump() {
		System.out.println("높이 뜀");
	}
}
