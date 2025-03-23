package q1;



class Emp{
	String name;
	int id ;
	double sal;
	String address;
	
	public Emp(String name, int id, double sal, String address) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}
	
	void displayInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(address);
		
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp("soham", 12220, 21330, "boriwali");
		System.out.println(emp);
		emp.displayInfo();
		
	}

}
