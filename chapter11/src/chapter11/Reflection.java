package chapter11;

import java.lang.reflect.Constructor;

class Emp{
	
	String name;
	int age;
	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}

public class Reflection {
	public static void main(String[] args) {
		Emp emp = new Emp("soham", 1);
		System.out.println();
		
		
		
	}

}
