package Q1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OperationImp implements Operations {

	List<EmpPojo> db = new ArrayList<EmpPojo>();

	@Override
	public void insertData(List<EmpPojo> list) {
		db.addAll(list);
		System.out.println("data is inserted");

	}

	@Override
	public void updateData(int id, String name) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId() == id) {
				empPojo.setName(name);
				System.out.println("data updated ");
			}

		}

	}

	@Override
	public void deleteData(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId() == id) {
				db.remove(id);
				System.out.println("data is deleted");
			}

		}

	}

	@Override
	public void search(int id) {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if(empPojo.getId() == id ) {
				System.out.println("here is the data which you searched for");
				System.out.println(empPojo);
			}
			
		}
		

	}

	@Override
	public void showData() {
		Iterator<EmpPojo> iterator = db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			System.out.println(empPojo);

		}

	}

}
