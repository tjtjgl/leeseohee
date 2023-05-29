package inheritance;

class 포켓몬 { // 부모클래스

	// 포켓몬 공통부분 모으기
	String name;
	int hp;
	String type;
	double wei;

	void attack() {
		System.out.println("펀치");
	}
}

class 꼬부기 extends 포켓몬 {
	void 물대포() {
	}

}

class 어니부기 extends 꼬부기 {
	void 쌍물대포() {
	}
}

class 거북왕 extends 어니부기 {
	void 물폭탄x100() {
	}
}

//==================================================
class 캐릭터 {
	String id;
	int 목숨;
	int 마법력;
	int 민첩;
	int 힘;

	void attack() {
	}
}

class 마법사 extends 캐릭터 {

}

class 바드 extends 마법사 {
	void 힐() {
	}
}

class 아르카나 extends 마법사 {
	void 카드() {
	}
}

class 전사 extends 캐릭터 {

}

public class InheritanceEx01 {

	public static void main(String[] args) {
		꼬부기 꼬북 = new 꼬부기();
		어니부기 어니북 = new 어니부기();
		
		꼬북.name = "꼬부기";
		꼬북.hp = 900;
		

	}

}
