package q2;

import java.lang.reflect.Method;
import java.util.Objects;

class Emp implements Cloneable{
	String name;
	int id;
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("the object is deleted");
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}



public class Fetch {
	public static void main(String[] args) throws Exception {
		Emp emp = new Emp("soham", 1);
		emp =null;
		System.gc();
		
		Emp emp1 = new Emp("rohan", 2);
		System.out.println(emp1);
		Emp emp2 = new Emp("rohan", 2);
		System.out.println(emp1.equals(emp2));
		
		Emp empclone = (Emp)emp1.clone();
		System.out.println(empclone);
		
		//GET CLASS METHOD 
		
		Emp emp3 = new Emp("soham", 1000);
		System.out.println(emp3.getClass());
		Method methods[]= emp3.getClass().getMethods();
		for(int i=0; i < methods.length;i++) {
			System.out.println(methods[i]);
		}
		
	}

}
