package q1;

interface A {

	void A();

}

abstract class B {
	abstract void B();
}

class C {

	void C() {

	}

}

class Emp {

}

public class Main {
	public static void main(String[] args) {

		A a = new A() {
			public void A() {
				System.out.println("Interface");
			}
		};
		
		B b = new B() {
			@Override
			void B() {
				System.out.println("this is a abstract class");
				
			}
		};
		
		C c = new C() {
			@Override
			void C() {
				// TODO Auto-generated method stub
				System.out.println("this is a normal class");
			}
		};
		
		
		a.A();
		b.B();
		c.C();

	}

}
