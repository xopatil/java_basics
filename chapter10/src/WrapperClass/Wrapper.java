package WrapperClass;

public class Wrapper {
	public static void main(String[] args) {
		
		/*every primitive data type has its own wrapper class , if we want to convert
		 primitive data type into its object we make use of the wrapper classes that 
		 is the object class of the primitive data type.
		*/
		int i = 10;
		Integer integer = new Integer(i);
		System.out.println(integer);
		
		int c = integer.intValue();
		System.out.println(c);
		
		
	}

}
