package threadingdemo;

import java.util.Scanner;

public class JoinDemo {
	public static void main(String args[]) {
		
		System.out.println("Sum of first N numbers");
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Calculator calc = new Calculator(n);
		calc.start();
		
		try {
			calc.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		printmessage()
		
		System.out.println("Sum of first "+ n + " numbers =" + calc.getSum() );
	}

}

class Calculator extends Thread{
	int n;
	int sum;
	
	Calculator(int n){
		this.n = n;
	}
	
	public void run() {
		for(int i=1; i<=n ; i++) {
			this.sum += i;
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int getSum() {
		return this.sum;
		
	}
}