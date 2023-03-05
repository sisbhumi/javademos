package firstdemo;

public class Firstclass {
	
	public static void main(String args[]) {
	
		MacBook mac = new MacBookAir();//assigning subclass object to parentclass
		mac.start();
		mac.shutdown();
	}
}

class MacBook{
	void start() {
		System.out.println("MacBook started");
	}
	void shutdown() {
		System.out.println("MacBook shutdown");
	}
}

class MacBookAir extends MacBook{
	void start() {
		System.out.println("MacBook started");
	}
	void shutdown() {
		System.out.println("MacBook shutdown");
	}
}

class MacBookPro extends MacBook{
	void start() {
		System.out.println("MacBook started");
	}
	void shutdown() {
		System.out.println("MacBook shutdown");
	}
}
