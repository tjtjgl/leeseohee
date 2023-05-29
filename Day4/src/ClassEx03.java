class Pokemon{
	
	//포켓몬 정보
	String name;
	double weight;
	String charact;
	
	//기본 생성자
	Pokemon(){
		
	}
	
	//생성자
	Pokemon(String name, double weight, String charact){
		this.name = name;
		this.weight = weight;
		this.charact = charact;
	}
	
	//싸우는 기능
	void attack() {
		System.out.println(name + "의 공격!");
	}

}

public class ClassEx03 {

	public static void main(String[] args) {

		//잠만보 객체 생성, 객체 빈 값으로 자동 초기화(
		Pokemon j = new Pokemon(); 
		
		j.name="잠만보";
		j.charact = "zZ";
		j.weight = 460.0;
		
		j.attack();
		
		//생성자를 통해 생성 동시에 값을 초기화
		Pokemon m = new Pokemon("먹고자",105.0,"대식가");
		
		m.attack();
		
	}

}
