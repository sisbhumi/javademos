package mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsDemo {
	public static void main(String args[]) {
		//hashmap
		// allows one null key
		Map<String, Integer> marks = new HashMap<>();
	    marks.put("bob", 10);
	    marks.put("hela", 35);
	    marks.put("bina", 56);
	    marks.put("nora", 83);
	    marks.put("sila", 63);
	    System.out.println(marks);
	    System.out.println(marks.keySet());
	    System.out.println(marks.values());
	    
	    for( String key: marks.keySet()) {
	    	System.out.println(marks.get(key));
	    }
	    
	    Map<String, Integer> marks2 = new LinkedHashMap<>();
	    marks2.put("bob", 10);
	    marks2.put("hela", 35);
	    marks2.put("bina", 56);
	    marks2.put("nora", 83);
	    marks2.put("sila", 63);
	    System.out.println(marks2);
	}

}
