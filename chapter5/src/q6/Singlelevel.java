package q6;

class Engineers {

	void work() {
		System.out.println("engineers solve problems");
	}

}

class ComputerEngineers1 extends Engineers {
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("computer engineers dont have a work future in Sfit");
	}

}

public class Singlelevel {
	public static void main(String[] args) {
		Engineers engineers = new Engineers();
		ComputerEngineers computerEngineers1 = new ComputerEngineers();
		engineers.work();
		

	}

}
