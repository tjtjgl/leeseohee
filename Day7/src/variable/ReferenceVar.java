package variable;

class Employee {

	String name; // 직원명
	int[] hours; // 요일별 일한 시간

	public Employee(String name, int[] hours) {
		this.name = name;
		this.hours = hours;
	}

	// 시간계산 함수
	void printTotalHours() {
		System.out.println(this.name + "->" + totalHours() + "시간");
	}

	// 시간출력 함수
	int totalHours() {
		int sum = 0;

		for (int val : hours) {
			sum += val;
		}

		return sum;
	}
}

public class ReferenceVar {

	public static void main(String[] args) {
		int[] hours0 = { 2, 4, 3, 4, 5, 8, 8 };
		int[] hours1 = { 7, 3, 4, 3, 3, 4, 4 };
		int[] hours2 = { 3, 3, 4, 3, 3, 2, 2 };
		int[] hours3 = { 9, 3, 4, 7, 3, 4, 1 };
		int[] hours4 = { 3, 5, 4, 3, 6, 3, 8 };
		int[] hours5 = { 3, 4, 4, 6, 3, 4, 4 };
		int[] hours6 = { 3, 7, 4, 8, 3, 8, 4 };
		int[] hours7 = { 6, 3, 5, 9, 2, 7, 9 };

		// e0이 레퍼런스 변수
//		Employee e0 = new Employee("직원0", hours0);
//		e0.printTotalHours();
//		Employee e1 = new Employee("직원1", hours1);
//		e1.printTotalHours();
//		Employee e2 = new Employee("직원2", hours2);
//		e2.printTotalHours();
//		Employee e3 = new Employee("직원3", hours3);
//		e3.printTotalHours();
//		Employee e4 = new Employee("직원4", hours4);
//		e4.printTotalHours();
//		Employee e5 = new Employee("직원5", hours5);
//		e5.printTotalHours();
//		Employee e6 = new Employee("직원6", hours6);
//		e6.printTotalHours();

		// 직원(객체들을 저장하는/관리하는 배열), 레퍼런스배열
		Employee[] lst = new Employee[8];
		lst[0] = new Employee("직원0", hours0);
		lst[1] = new Employee("직원1", hours1);
		lst[2] = new Employee("직원2", hours2);
		lst[3] = new Employee("직원3", hours3);
		lst[4] = new Employee("직원4", hours4);
		lst[5] = new Employee("직원5", hours5);
		lst[6] = new Employee("직원6", hours6);
		lst[7] = new Employee("직원7", hours7);
		
		for(Employee val : lst) {
			val.printTotalHours();
		}

	}

}
