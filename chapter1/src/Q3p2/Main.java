package Q3p2;

import Q3p1.A;

class Emp extends Q3p1.A{
	public static void main(String[] args) {
		Emp emp = new Emp();
		System.out.println(emp.c);
		System.out.println(emp.a);
	}
		
}
//doubt child class , protected ko agar cjild class me call karna hai toh child cllass ka ky uobjetc banana padega
public class Main extends Q3p1.A{
	public static void main(String[] args) {
		A a = new A();
		Main main = new Main();
		System.out.println(a.a);
		System.out.println(main.c);
		
		
	}
}
