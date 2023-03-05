package firstdemo;

public class Polymorphism {
	public static void main(String args[]);
	
}

class ElectronincDevice{
	void powerOn() {
		System.out.println("Device powered on");
	}
}

//class DesktopComputer extends ElectronicDevice{
//	void powerOn() {
//		System.out.println("TV Guide Screen displayed");
//	}
//}
//
//class Monitor extends ElectronicDevice{
//	void powerOn() {
//		System.out.println("Black Screen displayed");
//	}
//}

class DesktopComputer implements TV, Monitor{
	publiv void powerOn() {
		TV.super.powerOn();
		Monitor.super.powerOn();
	}
}

interface TV{
	public default void powerOn() {
		System.out.println("I1 starting...");
	}
}

interface Monitor{
	public default void powerOn() {
		System.out.println("I2 starting...");
	}
}
