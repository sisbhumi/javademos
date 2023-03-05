package threadingdemo;

public class ThreadCommunicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.setName("Ti");
		t.start();
		synchronized(t) {
			Utils.printmessage("going to wait");
			try {
				t.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Utils.printmessage("Notified");
			Utils.printmessage("Total " + mt.total);
		}
	}

}
class MyThread implements Runnable {
	int total;
	@Override
	public void run() {
		
		Utils.printmessage("Calculating sum");
		
		synchronized (this) {
			for( int i =0 ; i<=100; i++)
				total += i;
			Utils.printmessage("Calculation completed notifying");
			this.notify();
		}
		
	}
	
}