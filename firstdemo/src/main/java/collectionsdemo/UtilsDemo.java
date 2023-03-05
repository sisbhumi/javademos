package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class UtilsDemo {
	public static void main(String args[]) {
		
		List<String> mylist = new ArrayList<>();//treeset provide ordering
		mylist.add("Maxwell");
		mylist.add("Johnsinha");
		mylist.add("Hella");
		mylist.add("Bella c");
		mylist.add("Cao");
		System.out.println(mylist);
		
		Collections.sort(mylist, new MyComparator());
		
		int result = Collections.binarySearch(mylist, "Hella");
		 
	}
}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}

}
