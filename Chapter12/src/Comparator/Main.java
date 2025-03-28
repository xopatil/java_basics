package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Emp implements Comparable<Emp>{
	
	
	String name;
	int id;
	double sal;
	public Emp(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Emp o) {
		
		return this.id - o.id;
	}
	
	
	
}




public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("soham", 1, 13000);
		Emp emp1 = new Emp("sohampatil", 4, 12000);
		Emp emp2 = new Emp("patil", 3, 11000);
		Emp emp3 = new Emp("sohamsoham", 2, 14000);
		
		List<Emp> emps = new ArrayList<Emp>();
		emps.add(emp);
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		
		
		Collections.sort(emps);
		Iterator<Emp> iterator = emps.iterator();
		while (iterator.hasNext()) {
			Emp emp4 = (Emp) iterator.next();
			System.out.println(emp4);
			
		}
		System.out.println("-----------------------------");
		
		Collections.sort(emps, new Student());
		Iterator<Emp> iterator1 = emps.iterator();
		while (iterator1.hasNext()) {
			Emp emp5= (Emp) iterator1.next();
			System.out.println(emp5);
			
		}
		
	
		
		
	}

}
