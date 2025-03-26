package q2;

interface A{
	void A();
	
	
}

abstract class B{
	void B() {
		
	}
	
}

class C{
	A a ;
	B b ;
	public C(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}
	public void displayMeth() {
		a.A();
		b.B();
	}
}

public class Main {
	public static void main(String[] args) {
		C c = new C(new A() {
			public void A() {
				System.out.println("this is method A");
			};
		}, new B() {
			public void B() {
				System.out.println("this is method B ");
			};
		}) {
			
			
		};
				
		c.displayMeth();
	}

}
