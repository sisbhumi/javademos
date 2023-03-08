package functionalprogramming;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<String,Integer> f1 = s -> s.length();
		
		System.out.println("Length of Hello = " + f1.apply("Hello"));

	}

}
