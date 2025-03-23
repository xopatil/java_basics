package q2;

class Emp{
	String name;
	int id;
	static String Companyname;
	static String Empdept;
	
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}

	void displayEmpInfo() {
		System.out.println(name);
		System.out.println(id);
	}
	
	static void displayCompanydet() {
		System.out.println(Companyname);
		System.out.println(Empdept);
		
	}
}

public class Main {
	static {
		Emp.Companyname = "SDAC";
		Emp.Empdept = "frontend";
	}
	public static void main(String[] args) {
		
		Emp emp = new Emp("soham", 120);
		System.out.println(emp);
		System.out.println(Emp.Companyname);
		System.out.println(Emp.Empdept);
		
	}

}
