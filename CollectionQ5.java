/*5.Write a program to convert LinkedList to ArrayList*/


package CoreJavaTask;
import java.util.*;

public class CollectionQ5 {
	public static void main(String arg[]) {
		LinkedList <String> ll = new LinkedList<String>();
		ll.add("Taj");
		ll.add("Sonu");
		ll.add("Rithik");
		ll.add("Pareek");
		ll.add("Joto");
		
		System.out.println("Linked List values "+ll);
		ArrayList <String> name = new ArrayList<String> ();
		ArrayList <String> name1 = new ArrayList<String> ();
		
		for(String n : ll) {
			name.add(n);
		}
		
		System.out.println("Array List value"+name);
		String val=null;
		Iterator it = ll.iterator();
		while(it.hasNext()) {
		
			name1.add((String) it.next());
		}
		System.out.println(name1);
		
	}
}
