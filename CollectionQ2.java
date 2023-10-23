package CoreJavaTask;

import java.util.*;

public class CollectionQ2 {
public static void main(String arg[]) {
	int ar[] = new int[10];
	for(int i =0;i<10;i++) {
		ar[i] = i;
	}
	
	System.out.println("Array to ArrayList");
	ArrayList<Integer> al = new ArrayList<> ();
	for(int i =0;i<10;i++) {
		al.add(ar[i]);
	}
	al.forEach(System.out::println);
	for(Integer val: al) {
	System.out.println(val);
	}
	
	System.out.println("ArrayList to Array");
	int new_ar[] = new int[10];
	for(int i=0;i<al.size();i++) {
		new_ar[i]=al.get(i);
	}
	int s=new_ar.length;
	for(int i=0;i<s;i++) {
		System.out.print(i);
	}
	
	}
}
