package question_one;



class Address{
	String city;	
	int pincode;
	public Address(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
	
}


class Hobbies{
	
}

class Emp{
	String name;
	int id;
	Address adrress;
	Hobbies hobbies;
	public Emp(String name, int id, Address adrress, Hobbies hobbies) {
		super();
		this.name = name;
		this.id = id;
		this.adrress = adrress;
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", adrress=" + adrress + ", hobbies=" + hobbies + "]";
	}	
}



public class composition {
	public static void main(String[] args) {
		Address address = new Address("borivali", 1);
		Emp emp = new Emp("soham", 1,address , null);
		System.out.println(emp);
		System.out.println(emp.adrress);
		System.out.println(emp.hobbies);
		
	}

}
