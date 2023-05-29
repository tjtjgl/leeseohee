package supermario;

import java.util.Random;

class Character1 {

	String name;
	int hp;

	Character1() {
	}

	public Character1(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	void attack(Character1 attack) { // 공격대상에 대해 적용
		System.out.println(this.name + "가 발차기 공격을 합니다.");
		attack.hp -= 50;
		System.out.println(attack.name +" 목숨: " + attack.hp);
	}

}

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Character1 mario = new Character1("마리오", 150);
		Character1 coopa = new Character1("쿠파", 300);
		Character1 luigi = new Character1("루이지", 150);
		Character1 peach = new Character1("피치공주", 150);

		//우리는 한 팀 , 같은 자료형을 묶는 것은 배열!
		Character1[] team = new Character1[3]; 
		
		//각 캐릭터 저장
		team[0] = mario;
		team[1] = luigi;
		team[2] = peach;
		
		for (int i= 0 ; i < team.length ; i++) {
		team[i].attack(coopa);	
		}
		
		coopa.attack(team[r.nextInt(3)]);
//		int i = r.nextInt(3) + 0; 
//		coopa.attack(team[i]);
		
//		// 마리오가 쿠파를 공격
//		mario.attack(coopa);
//
//		// 쿠파가 마리오를 공격
//		coopa.attack(mario);
//		
//		// 루이지가 쿠파를 공격
//		luigi.attack(coopa);
	}

}
