package functionalprogramming;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
	
//		Predicate<Integer> gt20 = (i) -> (i>20);
//		System.out.println("Is 15>20: "+ gt20.test(34));
//		
//		Predicate<String> strLenGrtrThan5 =(s)->(s.length()>5);
//		System.out.println("Hello > 5: " + strLenGrtrThan5.test("hello"));
//	
//		Predicate<Integer> gt10 = (i) -> (i>10);
//		int []x = {0, 10, 13, 15,8};
//		m1(gt10,x);
		
		//challange
		Predicate<Integer> isEven = (i) -> (i%2==0);
		int []y = {1,2,3,4,5,6,7,8,9,10};
		chllng(isEven,y);
		
		//calling multiple predicate
		Predicate<Integer> gt5 = (i) ->(i>5);
		Predicate<Integer> Even = (i) -> (i%2==0);
		chllng(gt5.and(Even),y);
		chllng(gt5.or(Even), y);
	}
	
	//applications of predicate
	//passing predicate as parameter
	static void m1(Predicate<Integer> p, int []x) {
		for( int i: x) {
			if(p.test(i)){
				System.out.print(i+" ");
			}
		}
	}
	
	//challange: write predicate to check evennumber
	//pass thid to arra and print only even numbers
	static void chllng(Predicate<Integer> p, int []x) {
		for( int i: x) {
			if(p.test(i)){
				System.out.print(i+" ");
			}
		}
	}
}
