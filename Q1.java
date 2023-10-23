package CoreJavaTask;
import java.util.*;

class Contacts{
	String name;
	long number1;
	long number2;
	long number3;
	long number[];
	
	public void getnumber(String n, long n1) {
		this.name=n;
		this.number1=n1;
	}
	public void getnumber(String n, long n1,long n2) {
		this.name=n;
		this.number1=n1;
		this.number2=n2;
	}
	public void getnumber(String n, long n1, long n2,long n3) {
		this.name=n;
		this.number1=n1;
		this.number2=n2;
		this.number3=n3;
	}
	
	// to accept more than 3 long values
	public void lamda(String n, long...arg1) {
		this.name=n;
		this.number=arg1;
	}
	
}

public class Q1 {
	public static void main(String str[]) {
		Scanner sc = new Scanner(System.in);
		
		long num[]=new long[4];
		String c;
		
		
		System.out.println("Enter contact name :");
		c=sc.next();
		System.out.println("Enter the number of contacts you want to enter for a particular contact");
		int nn=sc.nextInt();
		int i;
		
		if(nn>3) {
			System.out.println("Number of contacts greater than ");
		}
	
		for(i=0; i<nn;i++) {
			System.out.println("Enter "+(i+1)+" number :");
			num[i]=sc.nextInt();
			}
		switch(nn) {
		
		case 1:
			Contacts c1 =new Contacts();
			c1.getnumber(c, num[i]);
			break;
		case 2:
			Contacts c2 =new Contacts();
			c2.getnumber(c, num[i], num[i]);
			break;
		case 3:
			Contacts c3 =new Contacts();
			c3.getnumber(c, num[i], num[i], num[i]);
			break;
		
	}
		
	}
}

