package Main;

import Manager.Manager;
import Employee.Employee;


public class Main {
	public static void main(String[] args) {
		Manager manager = new  Manager();
		Employee employee= new Employee();
		System.out.println(manager.calsal(1200, 340, 40));
		System.out.println(employee.calsal(1300));
		
	}

}
