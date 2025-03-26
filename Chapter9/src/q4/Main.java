package q4;

class Outer {

	static private int data = 15;

	static class Inner {

		void innerMeth() {
			System.out.println("this is non static" + data);

		}

		static void innerStaticMeth() {
			System.out.println("this is static " + data);

		}

	}

}

public class Main {
	public static void main(String[] args) {
		
		
		Outer.Inner inner = new Outer.Inner();
	    Outer.Inner.innerStaticMeth();
	    inner.innerMeth();

	}

}
