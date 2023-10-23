/*2) Write a program for example of multiple catch statements occurring in a
program.*/

package CoreJavaTask;

import java.util.*;

public class ExceptionQ2{
	public static void main(String arg[]) {
		MultiCatch mc =new MultiCatch();
		mc.list();

	
		}
	}

class MultiCatch {
	public int arr[]= new int[10];
	public void list() {
	
	
	try {
		for(int i =0;i<=11;i++)
		arr[i]= i;
	}
	catch(ArrayIndexOutOfBoundsException e1) {
		System.out.println("IndexOutOfBoundsException");
		
	}
	
	catch(NumberFormatException e2) {
		System.out.println("NumberFormatException");
	}
}}
