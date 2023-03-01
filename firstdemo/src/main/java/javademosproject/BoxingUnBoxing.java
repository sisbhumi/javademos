package javademosproject;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		// wrapper types
		
		int i = 10; // premitive datatype
		Integer a = new Integer(10);
		
		byte b = 7;
		Byte b1 = 8;
		
		// Boxing - automatic conversion of primitive to wrapper calss
		Integer x = 5;
		
		//Unboxing - conversion of wrapper class to primitive type
		Integer a1 = new Integer(50);
		int z = a1;
		System.out.println(z);
		
		Integer y = 200;
		if(y>100) {
			System.out.println(y);
		}

	}

}
