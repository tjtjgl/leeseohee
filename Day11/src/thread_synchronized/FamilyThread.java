package thread_synchronized;

public class FamilyThread extends Thread { // 집에 화장실이 하나밖에 없다

	private Washroom wr;
	private String who;

	public FamilyThread(String name, Washroom wr) {
		this.wr = wr;
		this.who = name;
	}

	@Override
	public void run() {
		wr.openDoor(who);
	}
	

}
