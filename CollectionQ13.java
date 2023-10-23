/*Write a program to serialize an ArrayList an ArrayList in java*/

package JavaCollection;
import java.util.*;
import java.io.*;

public class CollectionQ13 {
	public static void main(String[] args) {
		List<String> ar = Collections.synchronizedList(new ArrayList<String>());
		ar.add("Tajuddin");
		ar.add("Shadab");
		ar.add("Shagufta");
		ar.add("Shweta");
		ar.add("Sweta");
		ar.add("Aliva");
		
		synchronized(ar)
		{
			Iterator it = ar.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
}
