package threadingdemo;

public class SynchronizationDemo {

	public static void main(String[] args) {
		Monitor m = new Monitor();
		Thread t1 = new Thread(new MonitorWorker(m,"Steve"));
		Thread t2 = new Thread(new MonitorWorker(m,"Job"));
		t1.start();
		t2.start();
	}
}

class MonitorWorker implements Runnable{
	
	Monitor monitor;
	String name;
	
	MonitorWorker(Monitor monitor, String name){
		this.monitor = monitor;
		this.name = name;
	}
	@Override
	public void run() {
		monitor.displayGreeting(name);
	}
	
}

class Monitor{
//	public synchronized void displayGreeting(String name) {
//		for( int i = 0 ; i<11 ; i++) {
//			Utils.printmessage("How are you "+ name + " ?");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
	public void displayGreeting(String name) {
		synchronized (this) {
		for( int i = 0 ; i<11 ; i++) {
			Utils.printmessage("How are you "+ name + " ?");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
}
