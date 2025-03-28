package q6;


class Sdac{
	void makingNationEmployable(){
		
	}
	
}

class ComputerEngineers extends Sdac{
	@Override
	void makingNationEmployable() {
		// TODO Auto-generated method stub
		System.out.println("same as extc");
	}
	
}

class EXTC extends Sdac{
	@Override
	void makingNationEmployable() {
		// TODO Auto-generated method stub
		System.out.println("same as computer engineers");
	}
	
}
public class Hierarchical {
	public static void main(String[] args) {
		ComputerEngineers computerEngineers=new ComputerEngineers();
		computerEngineers.makingNationEmployable();
		EXTC extc=new EXTC();
		extc.makingNationEmployable();
		
	}

}
