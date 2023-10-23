/*4)Write a program to create interface named test. In this interface the
member function is square. Implement this interface in arithmetic class.
Create one new class called ToTestInt in this class use the object of
arithmetic class.*/




package CoreJavaTask;
import java.util.*;

interface test{
	int square(int n);
}
class arithmetic implements test{
	public int square(int a) {
		return a*a;
	}

	}
class Q4ToTestInt{
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		arithmetic a = new arithmetic();
		int ans=a.square(n);
		
		System.out.println("The Square of the number is = "+ans);
	}
}


