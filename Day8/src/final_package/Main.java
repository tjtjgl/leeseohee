package final_package;

class Person {
	final int hp = 100;
	final int age = 0;
}

class Tank {
	final int hp;
	
	Tank(int hp){
		this.hp =hp;
	}
	
	@Override
	public String toString() {
		return "탱크: " + this.hp;
	}
}

public class Main {

	public static void main(String[] args) {
		final int num = 100;
		
		Tank a= new Tank(10);
		System.out.println(a);

	}

}
