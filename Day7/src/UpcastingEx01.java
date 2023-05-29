class Animal1 {
	String name;
	int age;
}
class Animal_Hospital{
	
	Animal1[] 대기표 = new Animal1[50];
}

class Cat1 extends Animal1 {

}

class Dog1 extends Animal1 {
}

class Rabbit1 extends Animal1 {
}

public class UpcastingEx01 {

	public static void main(String[] args) {

		//동물병원 생성
		Animal_Hospital ah = new Animal_Hospital();
	
		//강아지 고양이 토끼
		ah.대기표[0]=new Dog1();
		ah.대기표[1]=new Cat1();
		ah.대기표[2]=new Rabbit1();
		
		// 다양한 객체들을 부모타입으로 관리할 수 있다.
	
	
	}

}
