package interface_package_printer;

public class Main {

	public static void main(String[] args) {

		// 흑백 프린터
		SamsungPrinter seohee = new SamsungPrinter();
		LGPrinter jihee = new LGPrinter();
		
		Samsung3DPrinter geonwoo = new Samsung3DPrinter();
		//건우가 참조할 수 있는 타입 = Samsung3DPrinter, 모든 인터페이스 3개, 오브젝트 총 5개
		
		Print3D p1 = geonwoo;
		boolean res = p1 instanceof Samsung3DPrinter;
		
		res = p1 instanceof Print;
		
		
		System.out.println(res);
		
	}

}
