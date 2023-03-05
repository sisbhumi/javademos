package filehandlingdemo;

import java.io.*;

public class FileHandlingDemo {
	public static void main(String[] args) {
		fileInputStreamDemo();
	}
	
	static void fileInputStreamDemo() {
		int i;
		File myfile = new File("");
		try {
			FileInputStream fis = new FileInputStream(myfile);
			System.out.println("");
			System.out.println("");
			while( (i= fis.read()) != -1) {
				System.out.println((char) i);
			}
			fis.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
