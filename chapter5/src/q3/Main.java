package q3;

class RBI {
	float Roi() {
		return 0f;
	}
}

class HDFC extends RBI {
	@Override
	float Roi() {

		return 8.1f;
	}

}

class BOM extends RBI {
	@Override
	float Roi() {

		return 8.2f;
	}

}

class Axis extends RBI {
	@Override
	float Roi() {

		return 8.3f;
	}

}

public class Main {
	public static void main(String[] args) {
		RBI rbi;
		rbi = new Axis();
		System.out.println(rbi.Roi());
		rbi = new BOM();
		System.out.println(rbi.Roi());
		rbi = new HDFC();
		System.out.println(rbi.Roi());
	}

}




