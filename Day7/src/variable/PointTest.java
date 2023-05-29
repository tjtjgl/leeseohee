package variable;

public class PointTest {

	public static void main(String[] args) {
		// 객체 생성
		Point p1 = new Point(0, 0);
		Point p2 = new Point(3, 4);

		// 거리 계산
		double dist = Point.distance(p1, p2);

		// 결과 출력
		System.out.printf("두 점 A%s, B%s 사이의 거리: %.2f", p1, p2, dist);
	}
}

class Point {
	/* 1. 필드를 만드시오. */
	int x;
	int y;

	/* 2. 생성자를 정의하시오. */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/* 3. 객체 정보를 문자열로 반환하는 인스턴스 메소드를 만드시오. */

	@Override
	public String toString() {
		return "("+x +","+y+")";
	}
	
	
	/* 4. 두 점 사이의 거리를 반환하는 클래스 메소드를 만드시오. */
	static double distance(Point a, Point b){
		double res=0;
		int x_axis=a.x-b.x;
		int y_axis=a.y-b.y;
		
		res = Math.sqrt(x_axis*x_axis + y_axis*y_axis);
		
		return res;
	}
}