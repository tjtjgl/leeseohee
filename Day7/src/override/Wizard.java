package override;

//마법사 파이어볼 데미지가 10씩 공격
public class Wizard {

	void fireball() {
		System.out.println("데미지 10씩 준다");
	}

}

//마법사 전직, 데미지 30씩 공격
class GreatWizard extends Wizard {

	@Override
	void fireball() {
		System.out.println("데미지 30씩 준다");
	}

}