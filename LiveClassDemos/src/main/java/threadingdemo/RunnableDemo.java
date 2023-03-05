package threadingdemo;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utils.printmessage("Begin main");
		
		ImageProcessor ip = new ImageProcessor();
		Thread t = new Thread(ip);
		t.start();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Utils.printmessage("Do some work");
			}
		});
		t1.start();
		
		Utils.printmessage("End Main");
	}
	
}


class ImageProcessor implements Runnable{

	@Override
	public void run() {
		
		Utils.printmessage("Processing an image.");
	}
	
}
