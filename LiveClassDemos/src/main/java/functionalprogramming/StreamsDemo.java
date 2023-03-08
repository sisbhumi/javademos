package functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {

		//this streams are used in collections
		//can convert a colection to stream by calling stream method
		
		List<Integer> list = new ArrayList<>();
		for( int i=0 ; i<=10 ; i++)
			list.add(i);
		System.out.println(list);
		
		List<Integer> filteredList = list.stream().filter(i -> i% 2 == 0).collect(Collectors.toList());
		System.out.println(filteredList);
		
		List<Integer> mulBy3 = list.stream().map(i -> i * 3 ).collect(Collectors.toList());
		System.out.println(mulBy3);
		
		//challange: print array list in lowercase
		List<String> names = new ArrayList<>();
		names.add("MAX");
		names.add("MILLER");
		names.add("JOHN");
		names.add("COLLIN");
		names.add("BOB");
		
		List<String> lowcase = names.stream().map(a -> a.toLowerCase()).collect(Collectors.toList());
		System.out.println(lowcase);
		
		Random random = new Random();
		List<Integer> list1 = new ArrayList<>();
		for( int i=0 ; i<=10 ; i++)
			list.add(random.nextInt(1,10));
		
		System.out.println("Original List "+ list1);
		System.out.println("Sorted List  "+ list.stream().sorted().)
	}

}
