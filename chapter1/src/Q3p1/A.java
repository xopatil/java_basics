package Q3p1;

public class A {
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);

	}

}

class B {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.a);
		System.out.println(a1.d);
		System.out.println(a1.c);

	}

}

class C extends A {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.a);
		System.out.println(c.d);
		System.out.println(c.c);
	}

}

