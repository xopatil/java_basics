package q4;

interface Policy {
	double calsal(double sal, double tax);

	double calsal(double sal, double bonus, double tax);

}

abstract class Company implements Policy {
	@Override
	public double calsal(double sal, double tax) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calsal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return 0;

	}

}

class Manager extends Company {
	@Override
	public double calsal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return sal+bonus-tax;
	}

}

class Employee extends Company {
	@Override
	public double calsal(double sal, double tax) {
		// TODO Auto-generated method stub
		return sal-tax;
	}
}

public class Main {
	public static void main(String[] args) {
		Manager manager = new  Manager();
		Employee employee = new  Employee();
		System.out.println(manager.calsal(12, 20, 20));
		System.out.println(employee.calsal(12,10));

	}

}
