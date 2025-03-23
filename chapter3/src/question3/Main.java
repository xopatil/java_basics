package question3;

 interface Company{

	 double calsal(double sal,double bonus, double tax);
	 double calsal(double sal, double bonus);
}
class Account implements Company{

	@Override
	public double calsal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calsal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Emp extends Account{
	@Override
	public double calsal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return sal + bonus - tax;
	}
}

class Manager extends Account {
	@Override
	public double calsal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return sal+bonus;
	}
	
}



public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Emp emp = new Emp();
		System.out.println(manager.calsal(12899, 444));
		System.out.println(emp.calsal(12333, 2120, 210));
		
	}

}
