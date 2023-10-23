/* Create a method which accepts an integer array and removes all the duplicates in the array.
Return the resulting array in descending order */

package CoreJavaTask;
import java.util.*;

public class CollectionQ19 {
		void sort(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbr of elements");
		int n = sc.nextInt();
		int values[] = new int[n];
		System.out.println("Enter the elements");
		for(int i = 0; i<n; i++) {
			values[i]=sc.nextInt();
		}
		for(int i =0; i<values.length;i++) {
			for(int j =i; j<values.length; j++) {
				if(values[j]>values[i]) {
					int c =values[j];
					values[j]=values[i];
					values[i]=c;
				}
			}
			
			}
		int clean[] = new int [n];
		int l=0;
		int j;
		for(int i =0; i<values.length;i++) {
				for(j =0;j<l;j++) {
					
					if(values[i]==clean[j]) {
						break;
					}
				}
				if(j==l)
				{
					clean[l]=values[i];
					l++;
				}
					
				}
			
		
		
		for(int index=0;index<l;index++) {
			System.out.println(clean[index]);
		}
		
	}
		
		public static void main(String[] args) {
			CollectionQ19 c = new CollectionQ19();
			c.sort();
			
		}
}
