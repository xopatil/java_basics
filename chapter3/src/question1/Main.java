package question1;

class Emp{
	String name;
	int age;
    static String Compnayname;
	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}
	
	static void calsal(double sal,double bonus,double tax) {
		System.out.println(sal+bonus-tax);
		
	}
}


public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("soham", 24);
		System.out.println(emp);
	    Emp.calsal(12222, 210, 120);
	}

}
