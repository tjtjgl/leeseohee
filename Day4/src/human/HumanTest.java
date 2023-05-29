package human;


public class HumanTest {

	public static void main(String[] args) {

	Human seohee = new Human("이서희", 162, 58);
	
	seohee.reduceWeight(10);
	System.out.println(seohee.getName()+ "의 몸무게는 " +seohee.getWeight() +"kg 입니다.");

	seohee.showInfo();
	
	}

}
