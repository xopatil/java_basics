package q6;



class Sdac1{
	void teaching() {
		System.out.println("we teach");
		
	}
	
	
}

class SfitComputerEngineers extends Sdac1{
	void learning() {
		System.out.println("we learn");
		
	}
	
}

class Soham extends SfitComputerEngineers{
	void revising() {
		System.out.println("i revise");
		
	}
	
}


public class Multilevel {
	public static void main(String[] args) {
		Soham soham = new Soham();
		soham.revising();
		soham.learning();
		soham.teaching();
	}

}
