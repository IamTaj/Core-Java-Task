/*2) Write a program for example of multiple catch statements occurring in a
program.*/

package CoreJavaTask;
import java.util.*;

class MultiCatch1 {
	public int arr[]= new int[10];
	public void list() {
	
	
	try {
		for(int i =0;i<=11;i++)
		arr[i]= i;
	}
	catch(Exception e1) {
		System.out.println("IndexOutOfBoundsException =>"+e1.getMessage());
		
	}
	
//	catch(NumberFormatException e2) {
//		System.out.println("NumberFormatException =>"+e2.getMessage());
//	}
}

public class ExceptiontaskQ2{
	public static void main(String arg[]) {
		MultiCatch1 mc =new MultiCatch1();
		mc.list();

	
		}
	}
}
