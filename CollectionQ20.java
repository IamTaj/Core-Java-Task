/*A string contains a list of states and capitals Write a method which can parse to states and capitals as map 
 * with states as key and capital as value
 * The string is in the below format. The states and capitals is separated by a delimeters.
 * There will be multiple state-capitals pairs and each state- capital pair is separated
 * Ex : Input will be tamilnadu-chennai || karnataka-bengaluru  
 * Here, || will be provided as del1 -will be provided as del2
 *  */

package JavaCollection;
import java.util.*;

public class CollectionQ20 {
	
	String capital;
	Scanner sc = new Scanner(System.in);
	
	//String stateCapital() {
		void stateCapital() {

		TreeMap<String, String> map = new TreeMap<>();
		map.put("Odisha","Bhubneshwar");
		map.put("West Bengal","Kolkata");
		map.put("Assam","Dispur");
		map.put("Jammu and Kashmir", "Srinagar");
		map.put("Punjab", "Chandigarh");
		map.put("Telangana","Hyderabad");
		map.put("Maharashtra", "Mumbai");
		map.put("Sikkim", "Gangtok");
		map.put("Gujarat","Gandhinagar");
		map.put("Goa", "Panaji");
		map.put("Bihar", "Patna");
		System.out.println("Enter the state");
		String input = sc.next();
		String state;
		String val2 = "";
		while(true) {
		for(Map.Entry val : map.entrySet()) {
			state =(String) val.getKey();
			if(state.equals(input)){
				val2=(String)val.getValue();
				//System.out.println("The capital of "+input+" is :"+val.getValue());
			}
			
		}
		if(val2.equals("")) {
			System.out.println("Not a valid state");
			System.out.println("Please enter a valid state");
			input = sc.next();
		}
		else {
			System.out.println("The capital of "+input+" is :"+val2);
			break;
		}
		}
		//return val2;
	}
	public static void main(String[] args) {
		
		CollectionQ20 q = new CollectionQ20();
		q.stateCapital();
		//String get;
		//get=q.stateCapital();
		//System.out.println(get);
	}
	}

