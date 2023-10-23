/*Ques 2.Suppose you went to a Shopping Centre (Allen Solly) near your home and bought a pair of jeans. A week later, while traveling to a nearby town,
you spot another Shopping centre. You walk into the shop and find a new variant of the same brand which you liked even more. But you decided to buy it from the shop near to your home.
Once back home, you again went to the Shopping Centre near your home to get those amazing pair of Jeans but couldn't find it. Why?
Because that was a specialty of the shop that was located in the neighbouring town. use polymorphism concept in this scenario*/

package CoreJavaTask;
import java.util.*;


class shop1{
	String item[]= {"Chinos","Slim-fit Jeans","Formals"};
	public void display() {
		//String cart[];
		System.out.println("\nThe Items available\n1.Chinos \n2.Slim-fit Jeans \n3.Formals");
	}
//	public int getLen() {
//		return item.length;
//	}
}
class Shop2{
	String item[]= {"Chinos","Slim-fit Jeans","Formals","Joggers"};
	public void display() {
		System.out.println("\nThe Items available\n1.Chinos \n2.Slim-fit Jeans \n3.Formals \n4.Joggers");
	}
}

public class Q2 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Shop 1\nShop 2\nEnter the shop number :");
		int input = sc.nextInt();
		String cart[];
		int l;
		switch(input){
		case 1:
			shop1 s1 = new shop1();
			s1.display();
			break;
			
			//l=s1.getLen();
			//System.out.println("\nEnter the item to add to list");
//			for(int i = 0;i<l;i++)
//			cart[i]=
		
		case 2:
		
			Shop2 s2 =new Shop2();
			s2.display();
			break;
		
		default:
			System.out.println("Sorry we dont have any shop of that number");
		}

}
}
