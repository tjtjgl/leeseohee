
class Avg {

	int kor;
	int eng;
	int mat;

	double avg;

	
	
	void average(int kor, int eng) {
//		this.kor =kor;
//		this.eng = eng;
		this.avg = ((double)kor + eng) / 2;
		System.out.println("평균: " + this.avg);
	}

	void average(int kor, int eng, int mat) {
		this.kor =kor;
		this.eng = eng;
		this.mat = mat;
		this.avg = ((double)this.kor + this.eng + this.mat) / 3;
		System.out.println("평균: " + this.avg);
	}
}


public class AvgTest {

	public static void main(String[] args) {

		Avg a1 = new Avg();
		a1.average(97, 100);
		a1.average(38, 100, 70);

	}
}