package starcraft2;

public class Main {

	public static void main(String[] args) {
		
		Tanker t = new Tanker(3000);
		Marine m = new Marine(500);
		Dropship d = new Dropship(5000);
		
		//체력이 많이 감소
		t.hp =10;
		d.hp =100;
		m.hp=5;
		
		//치료해줄 애들이 필요
		Doctor doctor = new Doctor(100);
		SCV s = new SCV(20);
		
		doctor.heal(m);
		doctor.heal(m);
		
		//s.repair(t);
		
	}

}
