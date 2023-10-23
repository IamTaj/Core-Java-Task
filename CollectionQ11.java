/*write a program to synchronize a HashMap in Java*/

package JavaCollection;
import java.io.*;
import java.util.*;

public class CollectionQ11 {
	public static void main(String[] args) throws Exception{
		try {
			HashMap<Integer, String> hm = new HashMap<>();
			hm.put(81, "Tajuddin");
			hm.put(45, "Soumyajeet");
			hm.put(21, "Ritik");
			hm.put(56, "Bratadeep");
			hm.put(12, "Rithik");
			
			System.out.println("Map : "+hm);
			
			Map<Integer, String> map = Collections.synchronizedMap(hm);
			
			System.out.println("Synchronized map is : "+map);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception throw : "+e);
		}
	}
}
