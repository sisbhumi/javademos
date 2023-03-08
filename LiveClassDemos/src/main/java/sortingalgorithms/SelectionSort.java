package sortingalgorithms;

import java.lang.reflect.Array;

public class SelectionSort {

	public static void main(String[] args) {
		insertionSort();

	}
	static void  insertionSort(){
		
		int a[] = {5,0,3,4,1};
		
		for(int i=0 ; i<a.length; i++) {
			for( int j=i ; j<a.length ; j++) {
				
				if(a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for (int i=0 ; i<a.length ; i++) {
			System.out.print(a[i]);
		}
	}
	
	static void insertionSortDemo() {
		int a[] = {5,0,3,4,1};
		for( int i=0 ; i<a.length; i++) {
			
			int indexofSmallest = i;
			for(int j=i ; j<a.length; j++) {
				if( a[j] < a[indexofSmallest]) {
					indexofSmallest = j;
				}
			}
			int temp = a[i];
			a[i] = a[indexofSmallest];
			a[indexofSmallest] = temp;
		}
		
	}

}
