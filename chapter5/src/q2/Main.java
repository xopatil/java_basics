package q2;

class Student {
	Student student() {
		System.out.println("student");
		return this;
	}

}

class marks extends Student {
	@Override
	marks student() {
		System.out.println("marks");
		return this;
	}

}

public class Main {
	public static void main(String[] args) {
		Student student = new  Student();
		marks marks = new  marks();
		System.out.println(student.student());
		System.out.println(marks.student());
		
	}

}
