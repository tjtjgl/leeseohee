package generic;

import java.util.ArrayList;

public class Person<T,E> {
	
	T name;
	E age;

	T id;
	E pw;

	
	public static void main(String[] args) {
		
		Person<String, Integer> p1 = new Person<>();
		p1.id = "name";
		p1.pw=1234;

		ArrayList<Person> list = new ArrayList<>();
		

	}

}
