import java.util.ArrayList;
import java.util.Scanner;
//고객정보
class User{
	
	String id,pw,phone,email;

	public User(String id, String phone) {
		super();
		this.id = id;
		this.phone = phone;

	}
	
}

//예매정보
class Reservation{
	
	String movieName, movieTime, roomNum;
	int people;
	
	public Reservation(String movieName, String movieTime, String roomNum, int people) {
		super();
		this.movieName = movieName;
		this.movieTime = movieTime;
		this.roomNum = roomNum;
		this.people = people;
	}
	
	

}

class CGV{
	
	//고객정보 저장하는 ArrayList
	ArrayList<User> userList = new ArrayList<>();
	
	ArrayList<Reservation> movieList = new ArrayList<>();
		
	//유저정보 + 영화정보
	//웅남이,98분,5관,2명
	
	void showInfo() {
		System.out.println();
		
	}
	
}

public class ClassEx06 {

	public static void main(String[] args) {

		User user = new User("seohee","01038593561");
		Reservation movie = new Reservation("웅남이", "98분", "5관", 2 );
	//	Reservation movie = new Reservation("스즈메의 문단속", "98분", "2관", 2 );
		
		CGV c1 = new CGV();
		
		c1.movieList.add(movie);
		c1.userList.add(user);
		

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("----CGV----");
			System.out.println("1. 영화예매");
			System.out.println("2. 영화예매 조회");
			System.out.println("3. 영화예매 삭제");
			System.out.println("0. 영화예매 종료");
			
			int sel1 =sc.nextInt();
			
			switch (sel1) {
			
			case 1:
				//예매 정보
				System.out.println("예매하실 영화의 제목/> ");
				System.out.println("1. 웅남이 2. 스즈메의 문단속 3. 슬램덩크 > ");
				int sel2 = sc.nextInt();
				
				switch (sel2) {
				case 1:
					
					break; 
					
				}
				
				
				
				
				break;
				
			case 2:
				break;
				

			case 3:
				break;
				

			case 0:
				break;
				
			default:
				System.out.println("잘못 누름");
				
			
			}
			
			
			
			
		}

	}

}
