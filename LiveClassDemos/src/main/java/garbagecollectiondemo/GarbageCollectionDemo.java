package garbagecollectiondemo;

import java.util.ArrayList;

import threadingdemo.Utils;

public class GarbageCollectionDemo {

	public static void main(String[] args) {
		
//		for(int i=0; i<100000; i++) {
//			new House(i); //orphan object as it does not have refrence
//		}
		
//		ArrayList<House> houses = new ArrayList<>();
//		for(int i=0; i<100000; i++) {
//			houses.add(new House(i)); //orphan object has reference so finalize will not run
//		}
		
		new House(1);
		new House(2);
		
		//we can request gc to run finalizer thread
		System.gc();
		
		
	}

}

class House{
	int id;
	House(int id){
		Utils.printmessage("House Created"+ id);
	}
	
	protected void finalize() throws Throwable {
		Utils.printmessage("House destroyed  "  + id);
	}
}