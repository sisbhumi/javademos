package threadingdemo;

public class DeadlockDemo {

	public static void main(String[] args) {
		FirstResource fr = new FirstResource();
		SecondResource sr = new SecondResource();
	}

}

class ResourceWorker implements Runnable{
	FirstResource fr ;
	SecondResource sr ;
	
	ResourceWorker(FirstResource fr, SecondResource sr){
		this.fr = fr;
		this.sr = sr;
	}
	@Override
	public void run() {
		fr.method1(sr);
		
	}
}

class FirstResource{
	void method1(SecondResource sr) {
		Utils.printmessage("Inside FirstResource method 1");
		for( int i = 0 ; i<=10 ; i++) {
			if( i%2 == 0)
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Utils.printmessage("Invoking secondResource.methid2");
		sr.method2();
	}
	
	public synchronized void method2() {
		Utils.printmessage("Firstresource.method2");
	}
}

class SecondResource{
	
	public synchronized void method1(FirstResource fr) {
		Utils.printmessage("Inside SecondResource method 1");
		try {
		Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utils.printmessage("Invoking FirstResource.methid2");
		fr.method2();
	}
	
	public void method2() {
		Utils.printmessage("SecondResource.method2");
	}
}