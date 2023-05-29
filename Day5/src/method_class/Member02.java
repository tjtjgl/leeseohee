package method_class;

class Movie {
	String movie_name;
	String movie_time;

}

public class Member02 {
	
	public static void moviePrint(Movie m) { //main 함수에서 가져올 변수의 자료형이 Movie 이므로 매개변수 자료형도 Movie 
		System.out.println("영화이름: " + m.movie_name + "\n상영시간: " + m.movie_time);
	}

	public static void main(String[] args) {

		// 옹남이,98분
		Movie m1 = new Movie();
		m1.movie_name = "웅남이";
		m1.movie_time = "98분";
		
		Movie m2 = new Movie();
		m2.movie_name = "존윅4";
		m2.movie_time = "130분";
		
		System.out.println(m1); 
		
		moviePrint(m1);
		moviePrint(m2);
		

	}

}
