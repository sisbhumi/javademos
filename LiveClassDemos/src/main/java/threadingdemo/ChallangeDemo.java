package threadingdemo;

public class ChallangeDemo {

	public static void main(String[] args) {
		int n = 10;
		for( int i=1 ; i<=10 ; i++)
			Utils.printmessage("" + i);
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				for( int i = 1 ; i<=10 ; i++) {
					if(i%2 == 0)
						Utils.printmessage("" + i);
				}
				
			}
			
		};
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				for( int i = 1 ; i<=10 ; i++) {
					if(i%2 != 0)
						Utils.printmessage("" + i);
				}
				
			}
			
		};
		
		Thread t1 = new Thread(r1);
		t1.setName("T_Even");
		t1.start();
		
		Thread t2 = new Thread(r1);
		t2.setName("T_Odd");
		t2.start();
		
		for( int i=1 ; i<= 10 ; i++) {
			Utils.printmessage("" + i);
		}

	}

}

//class allThread{
//	void method1(SecondResource sr) {
//		Utils.printmessage("Inside FirstResource method 1");
//		for( int i=0 ; i<=10 ; i++) {
//			Utils.printmessage("Thread" + i);
//		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//	}
//}
//
//class oddThread{
//	void method1(SecondResource sr) {
//		Utils.printmessage("Inside FirstResource method 1");
//		for( int i=0 ; i<=10 ; i++) {
//			if(i%2 == 0)
//				Utils.printmessage("Thread" + i);
//		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e)  {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}
//
//class evenThread{
//	void method1(SecondResource sr) {
//		Utils.printmessage("Inside FirstResource method 1");
//		for( int i=0 ; i<=10 ; i++) {
//			if( i%2 != 0)
//				Utils.printmessage("Thread" + i);
//		}
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//}



