/*7 Write a program to reverse ArrayList in java?*/

package CoreJavaTask;
import java.util.*;

public class CollectionQ7 {
	public static void main(String arg[]) {
		ArrayList <String> ogset = new ArrayList <String>();
		ArrayList <String> revset = new ArrayList <String>();
		ogset.add("9078787878");
		ogset.add("9067896712");
		ogset.add("9123456789");
		ogset.add("1234567890");
		ogset.add("9087654321");
		ogset.add("9870654321");
		int i = ogset.size()-1;
		for(;i>=0;i--) {
			revset.add(ogset.get(i));
		}
		System.out.println(revset);
	}
}
