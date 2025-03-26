package q1vectors;

public class EmpPojo {
	String name;	
	int id;
	String Address;
	public EmpPojo(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		Address = address;
	}
	@Override
	public String toString() {
		return "EmpPojo [name=" + name + ", id=" + id + ", Address=" + Address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	

}
