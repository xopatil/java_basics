package Comparator;

class Student implements java.util.Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		if (o1.id < o2.id) {
			return -1;
		} else if (o1.id > o2.id) {
			return 1;
		} else {
			return 0;
		}

	}

}

public class Comparator {
	public static void main(String[] args) {
		

	}

}
