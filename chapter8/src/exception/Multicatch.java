package exception;

class A1 {

	void meth() {
		try {
			int a[] = new int[5];
			a[10] = 10/0 ;
			System.out.println(a[10]);

		} catch (ArithmeticException a) {
			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}

public class Multicatch {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.meth();
	}

}
