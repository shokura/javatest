package javatest2;

public class Exercise05 {
	public static void main(String[] args) {
		Employee[] e = new Employee[6];
//		e[0] = new Employee("矢沢　晃", 5, 28);
//		e[0].display();
//		e[1] = new Employee("宮本　純子", 10, 33);
//		e[1].display();
//		e[2] = new Employee("藤原　美和子", 3, 23);
//		e[2].display();
//		e[3] = new Employee("土浦　巧", 25, 45);
//		e[3].display();
//		e[4] = new Employee("野崎　りさ", 18, 38);
//		e[4].display();
//		e[5] = new Employee("浅井　真治", 8, 31);
//		e[5].display();

		int i;
		String[] name = {"矢沢　晃","宮本　純子","藤原　美和子","土浦　巧","野崎　りさ","浅井　真治"};
		int[] year= {5,10,3,25,18,8};
		int[] age= {28,33,23,45,38,31};
		for(i=0;i<6;i++){
			e[i] = new Employee(name[i], year[i], age[i]);
			e[i].display();
			System.out.println("---------------------------------------------------------------------------");
		}


	}
}
