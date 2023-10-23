/*Write a program to serialize an ArrayList in Java*/

package JavaCollection;
import java.util.*;
import java.io.*;

public class CollectionQ12 {
	static void serializeArrayList() {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Tajuddin");
		nameList.add("Soumyajeet");
		nameList.add("Ritik");
		nameList.add("Rithik");
		nameList.add("Bratadeep");
		
		try {
			FileOutputStream file = new FileOutputStream("nameList");
			
			ObjectOutputStream myfile = new ObjectOutputStream(file);
			
			myfile.writeObject(nameList);
			
			myfile.close();
			file.close();
			
			System.out.println("CollectionQ12 serialized");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception{
		
		serializeArrayList();
		
	}
}
