package serializationdemo;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialisationDemo {
	public static void main(String args[]) {
		Employee emp1 = new Employee(1,"mark",1500,"AA1001");
		SerializationDemoSimplified();
		DeserializationDemo();
	}
	
	


	private static void DeserializationDemo() {
		
		//try-with block
		try( FileInputStream fis newFileInputStream("route");
			 ObjectInputStream ois = new ObjectInputStream(fis);){
			
			Employee emp = (Employee) ois.readObject();
			System.out.println("Object Deserialized - " + emp);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void SerializationDemoSimplified() {
		try( FileOutputStream fos =  new FileOutputStream("route");
				 ObjectOutputStream oos = new ObjectOutputStream(oos);){
				
				Employee emp1 = new Employee (1,"Max Fuller", 800, "PO123");
				oos.writeObject(emp1);
				System.out.println("Object Deserialized - " + emp1);
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
	}
}

 class Employee implements Serializable{

	 int id;
	 String name;
	 double salary;
	 String aadharno;
	 
	 Employee(int id, String name, int salary, String aadharno){
		 this.name = name;
		 this.id = id;
		 this.salary = salary;
		 this.aadharno = aadharno;
	 }
 
	 public String toString() {
		return aadharno;}
 }
 