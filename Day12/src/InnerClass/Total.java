package InnerClass;

class PokeBall {
	int size = 100;
	static int price = 5000;
	
	class User {
		String name;
		
		public User(String name) {
			this.name=name;
		}
		
	}

	static class PokeMonster {
		static String name = "이상해씨";
		int level = 10;

		public static void getPokeMember() {
			// 외부 클래스 인스턴스 멤버 접근 불가능
			// System.out.println(size);

			System.out.println(price);

			System.out.println(name);
			// System.out.println(level);
		}
	}

}

public class Total {

	public static void main(String[] args) {

		new PokeBall.PokeMonster();
		
		PokeBall.User u1 = new PokeBall().new User("이서희");
		
		
	}

}
