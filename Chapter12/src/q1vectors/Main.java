package q1vectors;

import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		
		EmpPojo empPojo = new EmpPojo("dhoni", 1, "borivali");
		EmpPojo empPojo1 = new EmpPojo("kohli", 1, "borivali");
		EmpPojo empPojo2 = new EmpPojo("rohit", 1, "borivali");
		EmpPojo empPojo3 = new EmpPojo("iyer", 1, "borivali");
		
		List<EmpPojo> list = new Vector<EmpPojo>();
		list.add(empPojo);
		list.add(empPojo1);
		list.add(empPojo2);
		list.add(empPojo3);
		
		OperationsImp imp = new OperationsImp();
		imp.insertData(list);
		
		
	}

}
