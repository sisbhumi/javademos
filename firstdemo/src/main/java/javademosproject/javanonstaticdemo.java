package javademosproject;

public class javanonstaticdemo {
	private javanonstaticdemo() {}
	
	static {
		System.out.println("from static block");
	}
	
	{
		System.out.println("from non-static block-1");
	}
	
	public static void main(String[] args) {
		System.out.println("From main method");
		javanonstaticdemo jnsd = new javanonstaticdemo();
		javanonstaticdemo jnsd2 = new javanonstaticdemo();
		
		Car mycar = new Car();
		System.out.println(mycar.numofwheels);
		System.out.println(Car.manufacturer);
	} 
}
