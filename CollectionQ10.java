/*Write a program to serialize a hashmap in java*/ 

package JavaCollection;
import java.util.*;
import java.io.*;
public class CollectionQ10 {
	public static void main(String[] args) {
	HashMap <Integer, String> hm = new HashMap<>();
	hm.put(81, "Tajuddin");
	hm.put(79, "Soumyajeet");
	hm.put(32, "Rithik");
	hm.put(54, "Bratadeep");
	hm.put(56, "Ritik");
	
	try {
		FileOutputStream file = new FileOutputStream("C:\\Users\\pc\\eclipse-workspace\\taj\\src\\JavaCollection\\CollectionQ10.java");
		
		ObjectOutputStream myfile = new ObjectOutputStream(file);
		
		myfile.writeObject(hm);
		myfile.close();
		file.close();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	
	}
}
