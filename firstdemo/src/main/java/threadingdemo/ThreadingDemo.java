package threadingdemo;

public class ThreadingDemo {

	public static void main(String[] args) {
		//Every program we run creates a process
		SingleThreaded st = new SingleThreaded();
		st.printNumbers();
	}

}
class SingleThreaded{
	void printNumbers() {
		System.out.print(Thread.currentThread().getName() + "_" );
		for( int i = 1 ; i<=200 ; i++)
			System.out.print(i + " ");
	}
}

class MultiTreaded extends Thread{
	public void run() {
		for( int i=1 ; )
			System.out.printlm()
	}
}
