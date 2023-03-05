package threadingdemo;

public class InterruptDemo {

	public static void main(String[] args) {
		Utils.printmessage("Start");
		
		Thread t = new Thread(new MonitorWorker());
		t.start();
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		Utils.printmessage("End");
	}

}

class Worker implements Runnable{

	@Override
	public void run() {
		Utils.printmessage("Start");
		for( int i=1 ; i<=10 ; i++) {
			Utils.printmessage(""+i);
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {

				Utils.printmessage("Thread interrupted");
			}
		}
		Utils.printmessage("End");
	}
	
}