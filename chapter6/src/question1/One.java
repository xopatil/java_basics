package question1;

interface Policy {
	double calsal(double sal , double bonus);
}


abstract class Company {
	void hours() {
		System.out.println("hours");
	}
	abstract void salary();
	abstract void work();
		
}

class Employee extends Company implements Policy{

	@Override
	void salary() {
		System.out.println("n");
		
	}

	@Override
	void work() {
		System.out.println("o");
		
	}

	@Override
	public double calsal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return sal + bonus;
	}
	
}

public class One {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.salary();
		System.out.println(employee.calsal(13588, 230));

	}
}
