package defaultpackage;

import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		ScannerDemo1();
		scannerDemo2();
	}

	private static void ScannerDemo1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Student name: ");
		String name = sc.next();
		
		System.out.println("Enter Student score: ");
		double score = sc.nextDouble();
	}
	
	private static void scannerDemo2() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		while(sc.hasNextInt()) {
			int num = sc.nextInt();
			sum += num;
			System.out.println("enter a number: ");
		}
		System.out.println("Sum: "+ sum);
	}

}
