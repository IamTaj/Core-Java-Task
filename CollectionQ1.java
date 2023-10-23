
package CoreJavaTask;
import java.util.*;

public class CollectionQ1 {
	public static void main(String arg[])throws Exception {
		
		try {
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			ar.add(i);
		}
		Collection<Integer> immutableArray = Collections.unmodifiableCollection(ar);
		System.out.println(immutableArray);
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i = 10; i > 0; i--) {
			hs.add(i);
		}
		Set<Integer> immutableSet = Collections.unmodifiableSet(hs);
		System.out.println(immutableSet);
		
		HashMap <Integer,String> hm = new HashMap<>();
		hm.put(1,"One");
		hm.put(2,"Two");
		hm.put(3,"Three");
		hm.put(4,"Four");
		hm.put(5,"Five");
		
		Map<Integer, String> immutableMap = Collections.unmodifiableMap(hm);
		System.out.println(immutableMap);
		
		
		}
		catch(Exception e) {
			System.out.println("The Items are immutable"+e.getMessage());
		}
		
	}

}