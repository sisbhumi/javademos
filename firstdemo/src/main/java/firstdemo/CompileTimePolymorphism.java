package firstdemo;

public class CompileTimePolymorphism {
	public static void main(String args[]) {
		CompileTimePolymorphism ctp = new CompileTimePolymorphism();
		ctp.add(1,2);
}

class CompileTimePolymorphism{
	//method overloading
	void add(inta, int b) {
		
	}
	
	void add(int a, float b) {
		
	}
	
	void add(float a, float b) {
	
	}
}