package Q1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		EmpPojo empPojo1 = new EmpPojo("messi", 1, "argentina");
		EmpPojo empPojo2 = new EmpPojo("ronaldo", 2, "portugal");
		EmpPojo empPojo3 = new EmpPojo("suarez", 35, "uruguay");
		EmpPojo empPojo4 = new EmpPojo("virat", 4, "india");
		
		List<EmpPojo> list = new ArrayList<EmpPojo>(); //upcasting 
		list.add(empPojo1);
		list.add(empPojo2);
		list.add(empPojo3);
		list.add(empPojo4);
		
		OperationImp imp = new OperationImp();
		
		imp.insertData(list);
		imp.showData();
		imp.updateData(3, "benzema");
		imp.showData();
		imp.deleteData(3);
		imp.showData();
		imp.search(35);
		
	
		
	}

}
