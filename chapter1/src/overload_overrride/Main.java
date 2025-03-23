package overload_overrride;


class Account{
	double calsal(double sal) {
		return sal;
	}
	double calsal(double sal,double bonus) {
		return sal + bonus;
	}
	double calsal(double sal , double bonus , double tax) {
		return sal +bonus-tax;
	}
	
}

class Manager extends Account{

	@Override
	double calsal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return sal + bonus - tax;
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println(manager.calsal(12000, 220, 220));
	}

}
