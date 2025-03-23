package exception;

import java.lang.Exception;

class A {

	public void meth() throws Exception {
		int c = 10 / 0;
		System.out.println(c);
	}

}

class B {
	A a = new A();

	void B() throws Exception {
		a.meth();
	}
}

public class Propagation {
	public static void main(String[] args) {
		B b = new B();
		try {
			b.B();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
