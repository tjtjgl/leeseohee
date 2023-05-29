package interface_package_printer;

public class SamsungPrinter implements Print {

	@Override
	public void print(String p) {
		System.out.println("삼성에서 나온 흑백 프린터");
	}

}

class SamsungColorPrinter implements ColorPrint {

	@Override
	public void print(String p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colorPrint(String p) {
		// TODO Auto-generated method stub
		
	}
	
}

class Samsung3DPrinter implements Print3D{

	@Override
	public void colorPrint(String p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(String p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void threeD() {
		// TODO Auto-generated method stub
		
	}
	
}