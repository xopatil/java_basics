package question4;

class Emp{
	private String name;
	private double salary;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}


public class pojo {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setSalary(19000);
		System.out.println(emp.getSalary());
	}

}
