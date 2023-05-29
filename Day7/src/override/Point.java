package override;

public class Point {
	int x;
	int y;
	
	@Override
	//기존 toString()은 클래스명@주소값을 반환
	//선언부는 같게, 안에 있는 내용은 자식 클래스에 맞게 변경
	//함수 호출하지 않아도 system.out.println() 호출하면 자동 호출되도록 약속되어 있음
	public String toString() {
		return "x: " + x + ", y: " + y;
	}

	void info() {
		System.out.println("x: " + x + ", y: " + y);
	}

}
class Point3D extends Point{
	int z;

	void info() {
		System.out.println("x: " + x + ", y: " + y +", z: "+z);
	}
	
}

