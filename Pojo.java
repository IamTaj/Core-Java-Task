/*Ques1. WAP on custom exception where it gives an 'Invalid Employee ID' Exception while entering into an Organization or office .
Create a pojo class that contains Employee details including name ,id ,address .If ID is not found must give exception mesaage that "given Employee ID is not found or mismatched ,
please enter the valid ID" and if ID is found give message as "Welcome to office". Take input from user and check the ID with the already existing Employee ids
//Note: Please add multiple employee details*/

package CoreJavaTask;

import java.util.*;

class Details {

	public int empid;
	public String empname;
	public String empaddress;

	public Details(int id, String name, String address) {
		this.empname = name;
		this.empaddress = address;
		this.empid = id;

	}
}

class InvalidChoice extends Exception {
	public String toString() {
		return "Invalid Employee ID";
	}
}

public class Pojo extends Exception {

	public static void main(String arg[]) throws InvalidChoice {
		Scanner sc = new Scanner(System.in);
		Details d[] = new Details[5];
		d[0] = new Details(123, "Taj", "Cda");
		d[1] = new Details(23, "Tdai", "da");
		d[2] = new Details(3, "dha", "ghfs");
		d[3] = new Details(12123, "Tyur", "Cdahd");
		d[4] = new Details(12331, "eqwewq", "a");
		
		
		int count=0;
		System.out.println("Enter the emplooyee id");
		int ed = sc.nextInt();
		int i=0;
		try {
			for (; i < 5; i++) {

				if (d[i].empid == ed) {
					System.out.println("Welcome to office");
					break;
				}
						 

				}
			if(i==5) {
				throw new InvalidChoice();
			}
		} catch (InvalidChoice e) {

			System.out.println("Customized exception demo : " + e);

		}
	}
}
