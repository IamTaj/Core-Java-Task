/* Problem Statement 16
 * Input: HashMap
 * {selva:75.6f,abi:89.5f,ram:40}
 * Output;hashmap
 * {selva:pass,abi:pass,ram:fail}
 * If the mark is >60 return the names and their status as pass in a output hashmap*/

package JavaCollection;
import java.util.*;

public class CollectionQ16 {
	public static void main(String arg[]) {
		HashMap<String, Float> std = new HashMap<>();
		HashMap<String, String> status = new HashMap<>();
		
		std.put("Tajuddin", 78.9f);
		std.put("Sartaz", 86.67f);
		std.put("Ritik", 54.67f);
		std.put("Soumyajeet", 76.56f);
		std.put("Rithik", 63.03f);
		std.put("Bratadeep", 58.67f);
		std.put("Bishal",91.23f);
		std.put("Rohit", 85.23f);
		std.put("Akshat",45.67f);
		
		System.out.println(std);
		float mval=0;
		String mname;
		for(Map.Entry m : std.entrySet()) {
			mval=(float) m.getValue();
			mname=(String) m.getKey();
			if(mval>60) {
				status.put(mname, "Pass");
			}
			else {
				status.put(mname, "Fail");
			}
			
		}
		System.out.println(status);
		}
	}

