package searchingalgo;

public class LinearSearch {

	public static void main(String[] args) {
		
		int searchItem = 67;
		int[] arr = {12, 45, 67, 78,89, 54};
		int index = linearSearch(arr,searchItem);
		if( index == -1) {
			System.out.println("Item " + searchItem + " not found");
			
		}else {
			System.out.println("Item " + searchItem + " found at " + index);
		}

	}
	
	private static int linearSearch(int[] arr, int searchitem) {
		for( int i=0 ; i<arr.length; i++) {
			if(arr[i] == searchitem) {
				return i;
			}
		}
		return -1;	}

}
