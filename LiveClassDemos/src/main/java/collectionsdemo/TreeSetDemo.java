package collectionsdemo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String []args) {
		Set<Integer> intset = new HashSet<Integer>();
		intset.add(10);
		intset.add(7);
		intset.add(3);
		intset.add(0);
		intset.add(9);
		intset.add(1);
		intset.add(3);
		System.out.println(intset);
		
		Set<String> strset = new TreeSet<String>( new StringComparator());//treeset provide ordering
		strset.add("Max");
		strset.add("John");
		strset.add("Hella");
		strset.add("Bella");
		strset.add("Cao");
		System.out.println(strset);
		
		Set<String> strset2 = new TreeSet<String>();//treeset provide ordering
		strset2.add("Maxwell");
		strset2.add("Johnsinha");
		strset2.add("Hella");
		strset2.add("Bella c");
		strset2.add("Cao");
		System.out.println(strset2);
		
		Set<Employee> employees = new TreeSet<Employee>();
		employees.add(new Employee(101, "Mark" , 1500, "AA1001"));
	}
}
class StringComparator implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		int l1 = str1.length();
		int l2 = str2.length();
		if(l1 < l2) { 
			return -1;
		}
		else if(l1 > l2) {
			return 1;
		}	
		else {
			return str1.compareTo(str2);
		}
		
	}
	
}
class Employee implements Comparable{
	int id;
	strin name;
	double salary;
	transient String aadharno;
	
	Employee ( int id, String name, double salary, String aadharno){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.aadharno = aadharno;
	}
	public String toString()
	{
		return this.id + "|" + this.name + "|" + this.salary + "|" + this.aadharno ;
	}
	
	public int compareTo(Employee o) 
	{
		return this.id < o.id ? -1 : 0;
		
	}	
}

class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
