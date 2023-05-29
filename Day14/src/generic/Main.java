package generic;

class Calc<T>{
	T x;
	T y;	
}

public class Main {

	public static void main(String[] args) {
		
		Calc<Integer> c1 = new Calc<>();
		Calc<Double> c2 = new Calc<>();
		
		//============다형성============
		Cup c = new Cup();
		Cup<Coffee> cup1 = new Cup<>();
		Cup<Water> cup2 = new Cup<>();
		Cup<Milk> cup3 = new Cup<>();
		
		//---------컵에 커피 담기
		c.obj = new Coffee();
		cup1.obj2 = new Coffee();
		cup1.obj2 = new Americano();
		
		//---------다 먹었으니 컵에 물 담기
		c.obj = new Water();
		//cup1.obj2 = new Water();
		
		//---------또 먹었으니 우유 담기
		c.obj = new Milk();
	}
}
