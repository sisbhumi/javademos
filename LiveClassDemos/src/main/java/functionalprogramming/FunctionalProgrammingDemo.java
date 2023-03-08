package functionalprogramming;

public class FunctionalProgrammingDemo {

	public static void main(String[] args) {
		
//		traditional way
		Calculator cacl = new Calculator();
		cacl.calculate(4, 5);
		
//		anonymus inner class
		ICalculator multiplier = new ICalculator() {
			public int calculate(int a, int b) {
				return a*b;
			}
		};
		
		multiplier.calculate(7,8);
		
//		lambda expression
		int x = 15;
		int y = 3;
		ICalculator divider = (a,b) -> {return a/b;}; 
		divider.calculate(10, 5);
		//used when if an inteface have only one method
		
		Sum s = (a,b)-> {return (a+b);};
		s.add(5, 6);

	}

}

interface ICalculator{
	int calculate(int a, int b);
}

class Calculator implements ICalculator{

	@Override
	public int calculate(int a, int b) {
		int result = a+b;
		
		return result;
	}
	
}

abstract class Sum{
	abstract int add(int a, int b);
}


