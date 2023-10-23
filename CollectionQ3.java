/*Ques 3. WAP to map multiple countries with their respective capitals using map .Iterating them using
1.foreach loop 
2.keyset iterator 
3.entryset iterator along with foreach 
4.EntrySet along with Java iterator*/

package CoreJavaTask;
import java.util.*;


public class CollectionQ3 {
	public static void main(String arg[]) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("Afghanistan", "Kabul");
		hm.put("Argentina","Buenos Aires");
		hm.put("India","Delhi");
		hm.put("Russia","Moscow");
		hm.put("Spain","Madrid");
		hm.put("Sweden","Stockholm");
		
		//foreach loop
		for(Map.Entry<String,String> country: hm.entrySet()) {
			System.out.println("Country :"+country.getKey()+" \tCapital :"+country.getValue());
			
		}
		
		//keyset iterator
		Iterator <Map.Entry<String,String>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> val  = it.next();
			System.out.println("Country :"+val.getKey()+" \tCapital :"+val.getValue());
		
		}
		
	
	
	}
	
}
