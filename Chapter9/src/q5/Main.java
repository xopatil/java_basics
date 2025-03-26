package q5;

class Outer{
	
	private int a = 10;
	public void meth() {
		class inner{
			void innerMeth() {
				System.out.println("this is a local inner method " + a );
			}
		}
		inner inner = new inner();
		inner.innerMeth();
		
	}
	
}

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.meth();
		
	}

}
