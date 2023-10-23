/*6 Write a program to convert HashSet to Array? */

package CoreJavaTask;
import java.util.*;

public class CollectionQ6 {
	public static void main(String arg[]) {
		HashSet <String> hsetcont = new HashSet<String>();
		ArrayList <String> arrcont = new ArrayList<String>();
		hsetcont.add("9078787878");
		hsetcont.add("9067896712");
		hsetcont.add("9123456789");
		hsetcont.add("1234567890");
		hsetcont.add("9087654321");
		hsetcont.add("9870654321");
		
		for(String num : hsetcont) {
			arrcont.add(num);
		}
		
		System.out.println(arrcont);
		
	}
}
