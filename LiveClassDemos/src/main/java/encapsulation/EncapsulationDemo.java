package encapsulation;

import javademosproject.Car;

public class EncapsulationDemo {
	public static void main(String args[]) {
		Car car = new Car();
		car.setColor("Red");
		System.out.println(car.getColor());
		System.out.println(car.getNumOfWheels());
	}
	
}

class Car{
	private String color;
	private int numofwheels;
	private boolean customizable;
	public static String manufacturer = "honda";
	
	public Car() {
		numofwheels = 4;
		color = "white" ;
		customizable = true;
	}
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		if( customizable)
			this.color = color;
	}
	public int getNumOfWheels() {
		return this.numofwheels;
	}
	public void setNumOfWheels(int numofwheels) {
		this.numofwheels = numofwheels;
	}
}