package interface_package;

interface Fly{
	void fly();
}

interface Walk{
	void walk();
}

interface Cry{
	void cry();
}

public class Bird implements Fly,Walk,Cry{

	@Override
	public void cry() {
	}

	@Override
	public void walk() {
	}

	@Override
	public void fly() {
	}
}

class Dog implements Walk, Cry{

	@Override
	public void cry() {
	}

	@Override
	public void walk() {
	}
	
}
