/* Create a method that can accept an array of String objects and sort in alphabetical order.
The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case.
Return the resulting array.
Note: If there are odd number of String objects, then (n/2)+1 elements should be in UPPPERCASE */

package CoreJavaTask;
import java.util.*;

public class CollectionQ18 {
	void divAndCon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int num = sc.nextInt();
	
		int check = num%2;
		String name[] = new String[num];
		String uval;
		String lval;
		String evenname[] = new String[num];
		String oddname[] = new String[num];
		System.out.println("Enter the elements ");
		for(int i =0; i<num; i++) {
			name[i] = sc.next();
			}
		Arrays.sort(name);
		for(int i =0; i<num; i++) {
		System.out.println(name[i]);
		}
		
		
		switch(check) {
		case 0:
			for(int i =0; i<num/2;i++) {
				uval=name[i];
				
				evenname[i]=uval.toUpperCase();
			}
			for(int j = (num/2);j<num;j++) {
				lval=name[j];
				evenname[j]=lval.toLowerCase();
			}
			break;
				
		case 1:
			for(int i =0; i<(num/2)+1;i++) {
				uval=name[i];
				
				oddname[i]=uval.toUpperCase();
			}
			for(int j = (num/2)+1;j<num;j++) {
				lval=name[j];
				oddname[j]=lval.toLowerCase();
			}
			break;
		}
		
		if(check==0) {	
		
		for(int i =0; i<num;i++) {
			
		System.out.println(evenname[i]);
		}
	}
		else {
			for(int i =0; i<num;i++) {
				
				System.out.println(oddname[i]);
				}
		}
		
		
	}
	public static void main(String arg[]) {
		CollectionQ18 c = new CollectionQ18();
		c.divAndCon();
					
		}
		
	}


