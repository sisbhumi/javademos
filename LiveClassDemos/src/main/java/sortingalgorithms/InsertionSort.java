package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(43);
		numbers.add(9);
		numbers.add(74);
		numbers.add(21);
		insertionSort(numbers);

	}
	
	static void insertionSort(List<Integer> numbers) {
		
		for(int i=1 ; i<numbers.size(); i++) {
			
			if(numbers.get(i) <= numbers.get(0)) {
				numbers.add(0,numbers.get(i));
				numbers.remove(i+1);
			}else if( numbers.get(i)<numbers.get(i-1)) {
				for(int j=1 ; j<i ; j++) {
					if(numbers.get(i) < numbers.get(j)) {
						numbers.add(j,numbers.get(i));
						numbers.remove(i+1);
					}
				}
			}
		
		}
		
			System.out.print(numbers);
	}
}
