package q1vectors;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OperationsImp implements Operations {
	
	List<EmpPojo> db = new Vector<EmpPojo>();
	

	@Override
	public void insertData(List<EmpPojo> list) {
		db.addAll(list);
		System.out.println("data is inserted ");
		
	}

	@Override
	public void updateData(int id, String name) {
		Enumeration<EmpPojo> enumeration = ((Vector<EmpPojo>) db).elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			
			if (empPojo.getId()==id) {
				empPojo.setName(name);
			}
			
		}
	
		
	}

	@Override
	public void deleteData(int id) {
		Iterator<EmpPojo> iterator = db.listIterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if(empPojo.getId() == id) {
				iterator.remove();
				System.out.println("the element has been removed successfully");
			}
			
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(int id) {
		Enumeration<EmpPojo> enumeration = ((Vector<EmpPojo>) db).elements();
		
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			
			if(empPojo.getId()==id) {
				System.out.println(empPojo);
			}
			
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showData() {
		Enumeration<EmpPojo> enumeration = ((Vector<EmpPojo>) db).elements();
		while (enumeration.hasMoreElements()) {
			EmpPojo empPojo = (EmpPojo) enumeration.nextElement();
			System.out.println(empPojo);
			
			
		}
		
		
	}
	
	

}
