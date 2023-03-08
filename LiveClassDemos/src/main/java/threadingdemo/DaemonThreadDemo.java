package threadingdemo;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		
		//Thread.currentThread().setDaemon(true); //setting main thread t odaemon
		Utils.printmessage("" + Thread.currentThread().isDaemon());
		Worker1 worker = new Worker1();
		
		Utils.printmessage(worker.isDaemon());
		//worker.setDaemon(true); //we have to do before thread starts
		worker.start();

	}

}

class Worker1 extends Thread {
	public void run() {
		for( int i=0 ; i<10; i++) {
			Utils.printmessage(i);
		}
	}
}
