package sortingalgorithms;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		bubbleSort();
		long end = System.currentTimeMillis();
		System.out.println("Time: "+ (end-start));

	}

	private static void bubbleSort() {
		int a[] = {1,2,3,6,3,4,8};
		
		for(int i=0 ; i<a.length; i++) {
			for( int j=1 ; j<a.length-i ; j++) {
				
				if(a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		
		for (int i=0 ; i<a.length ; i++) {
			System.out.print(a[i]);
		}
		
		System.out.println(" " + Arrays.toString(a));
	}
	
}


