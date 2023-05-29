package override;

public class OverrideEx {

	public static void main(String[] args) {

		Wizard w1 = new Wizard();
		w1.fireball();

		GreatWizard w2 = new GreatWizard();
		w2.fireball();
		
		Animal a1 = new Animal();
		a1.cry();
		
		Cat c1 = new Cat();
		c1.cry();
		
		Dog d1 = new Dog();
		d1.cry();
		
		Point p1 = new Point();
		System.out.println(p1);
				
		
		
		
	}

}
