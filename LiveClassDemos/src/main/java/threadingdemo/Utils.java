package threadingdemo;

public class Utils {

	
	
	public static void printmessage(boolean b) {
		System.out.println(Thread.currentThread().getName()+ " - "+ b);

	}
	
	public static void printmessage(int i) {
		System.out.println(Thread.currentThread().getName()+ " - "+ i);

	}

	public static void printmessage(String string) {
		System.out.println(Thread.currentThread().getName()+ " - "+ string);

	}
}
