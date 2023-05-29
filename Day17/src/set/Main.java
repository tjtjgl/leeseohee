package set;

import java.util.HashMap;
import java.util.HashSet;

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!((obj)instanceof Person)) return false;

		Person tmp = (Person) obj; 
		return this.name.equals(tmp.name) && (this.age == tmp.age);
	}
	
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
}

public class Main {

	public static void main(String[] args) {

		
		HashSet<Person> list = new HashSet<>();
		
		//객체 저장 전 같은 객체가 있는지 확인하는 것이 먼저!
		Person p1 = new Person("이서희", 30);
		Person p2 = new Person("이서희", 20);
		
		int hash1 = p1.hashCode();
		int hash2 = p2.hashCode();
				
		System.out.println(hash1 + " "+ hash2 );
		
		boolean res = p1.equals(p2);
		System.out.println(res);

		
		
		
		
		
		
		
		
//======================================================
		System.out.println("==========================");
		HashSet<Integer> set = new HashSet<>();
		
		//add(): 추가, 리턴값은 true, false
		set.add(2);
		set.add(1);
		set.add(3);
		set.add(4);
		set.add(2);
		System.out.println(set);
		
		set.remove(3);
		System.out.println(set);
	}

}
