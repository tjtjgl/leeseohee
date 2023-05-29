package thread_synchronized;

public class Washroom {

	synchronized void openDoor(String name) {
		System.out.println(name + " 입장");
		
		for(int i=0; i< 10000;i++) {
			if (i == 10000) {
				System.out.println(".....");
			}
		}
		System.out.println(name + " 퇴장");
	}
}
