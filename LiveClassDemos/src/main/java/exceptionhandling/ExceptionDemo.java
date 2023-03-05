package exceptionhandling;
import java.util.*;
public class ExceptionDemo {
	public static void main(String []args) {
		//divideByZero();
		nullPointerDemo();
	}
	
	private static void stringParserDemo() {
		String s = "2";
		int i = Integer.parseInt(s);
		System.out.println("Converted integer = " + i);
	}
	
	private static void nullPointerDemo() {
		try {
			String s = null;
			System.out.println("Length of string = " + s.length());
		}
		catch( Exception ex) {
			System.out.println("exception occured " + ex.getMessage()) ;
		}
	}
	private static void divideByZero() {
		int a,b,c,d;
		System.out.println("Enter 2 numbers...");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("The value inputted by user =" + a);
		try {
			c = a/b;
			d = a%b;
			System.out.println(c + " " + d);
		}
		catch (Exception ex) {
			System.out.println("Exception occurred " + ex.getMessage());
		}
	}
}
