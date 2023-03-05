package threadingdemo;

public class Utils {

	public static void printmessage(String msg) {
		System.out.println(Thread.currentThread().getName()+ " - "+ msg);

	}

}
