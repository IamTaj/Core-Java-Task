/*8 Write a program to iterate TreeMap in java?*/

package CoreJavaTask;
import java.util.*;

public class collectionQ8 {
	public static void main(String str[]) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String> ();
		tm.put(1,"Taj");
		tm.put(2,"Sonu");
		tm.put(3,"Rithik");
		tm.put(4,"Joto");
		tm.put(5,"Pareek");
		
		for(Map.Entry m : tm.entrySet()) {
			System.out.println("Keys :"+m.getKey()+ "   Value :"+m.getValue());
			
		}
	}
}
