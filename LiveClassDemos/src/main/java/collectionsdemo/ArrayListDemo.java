package collectionsdemo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String args[]) {
		demo1();
		demo2();
		demo3();
		practice();
		
	}
	
	private static void demo1() {
		ArrayList list = new ArrayList(); //this type contain all types of data which is not good practice
		list.add(10);
		list.add(20.4);
		list.add("hello");
		System.out.println(list);
	}
	
	private static void demo2() {
		ArrayList<String> newlist = new ArrayList<String>();
		newlist.add("hello");
		newlist.add("bhumika");
		System.out.println(newlist);
	}
	
	private static void demo3() {
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		for( int i = 10 ; i<50 ; i+=10) {
			intlist.add(i);
		}
		
		System.out.println(intlist);
		
		intlist.add(2,100);
		System.out.println(intlist);
		
	}
	
	private static void practice() {
		
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		
		for( int i = 10 ; i<50 ; i+= 5) {
			intlist.add(i);
		}
		
		System.out.println(intlist);
		
		//set value of position 3 to 101
		intlist.set(3,101);
		System.out.println(intlist);
		
		//remove a value from list
		intlist.remove(5);
		System.out.println(intlist);
		
		// search for value
		if(intlist.contains(101))
			System.out.println("Present at: "+ intlist.indexOf(101));
		
	}

}
