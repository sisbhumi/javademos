package searchingalgo;

public class BinarySearch {

	public static void main(String[] args) {
		
		int searchItem = 67;
		int[] arr = {12, 45, 67, 78,89, 54};
		int index = binarySearch(arr,searchItem);
		if( index == -1) {
			System.out.println("Item " + searchItem + " not found");
			
		}else {
			System.out.println("Item " + searchItem + " found at " + index);
		}

	}

	private static int binarySearch(int[] arr, int searchItem) {
		int low = 0;
		int high = arr.length - 1;
		int mid = (low+high)/2 ;
		
		while( low <= high) {
			if(searchItem > arr[mid]) {
				low = mid=1;
			}
			else if(searchItem <arr[mid]) {
				high = mid-1;
			}
			else
				return mid;
			
			mid = (low+high)/2;
		}
		return 0;
	}
	

}
