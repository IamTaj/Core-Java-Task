/*Ques 1. What are the Terminal operations? 
 *give an example for 
 *1.collect() 
 *2.reduce() 
 *3. anyMatch() , noneMatch() , allMatch() 
 *4. forEach() 
 *5.forEachOrdered()*/

package CoreJavaTask;
import java.util.*;
import java.util.stream.Collectors;

public class Java8Q1 {
	public static void main(String arg[]) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//collect()
		List<Integer> val =l.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(val);
		
		//reduce()
		List<Integer> red = l.stream().filter(x ->x%2==0).collect(Collectors.toList());
		System.out.println(red);
		
		//anyMatch()
		System.out.println(l.stream().anyMatch(x ->x*x==4));
		
		//noneMatch()
		boolean ans= l.stream().noneMatch(x ->x==2);
		System.out.println(ans);
		
		//allMatch()
		
		System.out.println(l.stream().allMatch(x -> x%1==0));
		
		//forEach
		System.out.println("forEach");
		l.forEach(x-> {if(x>5) {
			System.out.println(x);}});
		
		//forEachOrdered
		System.out.println("ForEachOrdered");
		l.stream().forEachOrdered(System.out::println);
	}

}
