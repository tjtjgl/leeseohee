class Animal{
	String name;
	}

class Cat extends Animal{
	int age;
	int wei;
}
class Dog extends Animal{}
class horse extends Animal{}


public class Upcasting {

	public static void main(String[] args) {

		//고양이 객체 생성, 부모+자식 변수 다 사용 가능
		Cat c1 = new Cat();
		c1.age=2;
		c1.name="야옹이";
		c1.wei = 1;
		
		//고양이는 동물이다
		Animal a = c1; //고양이 객체는 동물로 해석
		System.out.println(a.name);
		
		
		//자식이 부모를 참조 X
		Animal b = new Animal();
//		Cat c2 = b; //동물은 고양이다 X
	
		
		
	}

}
