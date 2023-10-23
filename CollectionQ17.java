/* Problem Statement 17:
 * A school offers medals to the students of tenth based on the marks
 * If(Marks>=90) : Gold
 * If(Marks between 80 and 90) : Silver
 * If(Marks between 70 and 80) : Bronze
 * Note: Marks between 80 and 90 means marks>=80 and marks<90
 * Write a function which accepts the marks of student as a HashMap and return the details of the student
 * eligible for the medals along with type of medal
 * The input hashmap contains the student registration number as key and mark as value
 * The out hashmap should contain the student registration number as key and medal type as value*/

package JavaCollection;
import java.util.*;

public class CollectionQ17 {
	
	Scanner sc = new Scanner(System.in);
	HashMap<Integer,Float> std = new HashMap<>();
	HashMap<Integer, String> list = new HashMap<>();
	int n;
	
	HashMap<Integer, String> details(){
		
		try {
		System.out.println("Enter the number of students record you want to enter");
		n=sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("Enter the number of students in integer value only");
		}
		int reg;
		float marks;
		int mreg;
		float mmarks;
		String gold = "GOLD";
		String silver = "SILVER";
		String bronze = "BRONZE";
		
		try {
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the registration mumber of Student "+i);
			reg=sc.nextInt();
			System.out.println("Enter the marks scored by Student "+i);
			marks=sc.nextFloat();
			std.put(reg, marks);
		}
		}
		catch(ArithmeticException e) {
			System.out.println("Sorry incorrect input format. Run again !");
		}
		for(Map.Entry m : std.entrySet()) {
			mreg = (int)m.getKey();
			mmarks = (float)m.getValue();
			if(mmarks>=90) {
				list.put(mreg, gold);
			}
			else if(mmarks>=80 && mmarks<90) {
				list.put(mreg, silver);
				
			}
			else if(mmarks>=70 && mmarks<80) {
				list.put(mreg, bronze);
			}
			else {
				list.put(mreg, "NONE");
			}
		}
		
		return list;
	}
	public static void main(String[] args) {
		CollectionQ17 q = new CollectionQ17();
		HashMap<Integer, String> status = q.details();
		System.out.println("*********************************************************************************");
		for(Map.Entry m : status.entrySet()) {
			System.out.println("\t\tREGISTRATION NO "+m.getKey()+" GOT "+m.getValue()+" MEDAL");
		}
	}
}
