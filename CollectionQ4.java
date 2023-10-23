/*4. perform followiing operations on array list
a)How to Iterate ArrayList using Java ListIterator
b)Arraylist add element at specific index
c)Sort ArrayList in descending order
d)insert an element to ArrayList using ListIterator
e)Hsort arraylist of strings alphabetically java
f)Sort elements of Java ArrayList
g)replace an element at specified index arraylist
h)Search an element of Java ArrayList
i)Remove element from specified index ArrayList
j)Remove duplicates from arraylist without using collections
*/

package CoreJavaTask;

import java.util.*;

public class CollectionQ4 {

	ArrayList<Integer> al = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	ArrayList<String> alstring = new ArrayList<>();
	
	void arrayList() {

		for (int i = 0; i < 10; i++) {
			al.add(i);
		}
	}

	void Iteration() {
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	void addElements() {
		try {
			System.out.println("Enter the index and ArrayList items to be inserted");
			int index = sc.nextInt();
			int val = sc.nextInt();
			al.add(index, val);
			System.out.println("The updated ArrayList is =" + al);
		} catch (Exception e) {
			System.out.println("Error value given or type mismatch");
		}
	}

	void sortArrayList() {
		Iterator<Integer> it1 = al.iterator();
		al.sort(Collections.reverseOrder());
		;
		System.out.println(al);
	}

	void insertElement() {
		// Iterator <Integer> it = al.iterator();

		ListIterator<Integer> it = al.listIterator();

		it.add(25);

		System.out.println(al);
	}
	

	void sortAlphabet() {
		alstring.add("Taj");
		alstring.add("Soun");
		alstring.add("Kofu");
		alstring.add("Jaiswal");
		alstring.add("Brata");
		alstring.add("Sartaz");
		alstring.add("Bishal");
		alstring.add("Akshat");
		alstring.add("Kofu");
		Collections.sort(alstring);
		System.out.println(alstring);
	}

	void replace() {
		System.out.println(alstring);
		System.out.println("Enter the index you want to repalce");
		int index = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the new data");
		String val = sc.nextLine();
		alstring.set(index, val);
		System.out.println(alstring);
	}

		void search() {
		System.out.println("Enter the element you want to search");
		String search = sc.nextLine();
		if(alstring.contains(search)==true) {
			System.out.println("The element is present in the record");
		}
		else {
			System.out.println("The element is not present in the record");
			
		}
		
	}
		void remove() {
			System.out.println("Enter the element you want to remove");
			String search = sc.nextLine();
			alstring.remove(search);
			System.out.println("The updated element is present in the record is "+alstring);
			
		}
		
		void removeDuplicate() {
			
			String n= null;
			int flag=0;
					ArrayList <String> newList = new ArrayList<String>();
					for(String str :alstring) {
						if(newList.contains(str)==false) {
							newList.add(str);
						}
					}
					alstring.clear();
					alstring.addAll(newList);
					//System.out.println("Value of duplicate element"+alstring);
					//System.out.println("Value after removal of duplicate element"+newList);
					System.out.println("Value after removal of duplicate element "+alstring);
		}
		
		
	public static void main(String arg[]) {

		CollectionQ4 e = new CollectionQ4();
		//e.arrayList();
		//e.Iteration();
		//e.sortArrayList();
		//e.insertElement();
		//e.addElements();
		e.sortAlphabet();
		e.replace();
		e.search();
		//e.remove();
		e.removeDuplicate();

	}
}
