package generic;

public class Box<T>  {

	T[] obj;
	
	public static void main(String[] args) {
		
		Box<Apple> box1 = new Box<>();
		box1.obj = new Apple[5];
		
		Box<Book> box2 = new Box<>();
		box2.obj = new Book[3];
		
		
	}
}

class Apple{}
class Book{}
class Shoes{}

