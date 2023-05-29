package interface_package_printer;

//인터페이스 상속 , 기능 참 많네,,,,,
//인터페이스는 다중 상속 가능
public interface Print {
	void print(String p); // 흑백
}

interface ColorPrint extends Print {
	void colorPrint(String p); // 컬러
}

interface ThreeDimensional{
	void threeD();
}


interface Print3D extends ColorPrint,ThreeDimensional {
	
}

