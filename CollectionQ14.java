/* Car Company stock maintenance and buying using collections
 * a. Add a main car company -->it should have  a type of cars -->Each type should have 
 * Ex : Mercedes -->SUV, Sedan,Compact SUV, a crossover,etc -->SUV{GLE 330D, GLE  
 * 
 * b.One User can register and select a type of car and  buy it, on  buying that sep
 * 
 * c.Initial data has to read from excel file */

package JavaCollection;
import java.util.*;


class Car {
	Scanner sc = new Scanner(System.in);
	void mercedes() {
		TreeMap<Integer,String> type = new TreeMap<>();
	
		type.put(1,"Suv");
		type.put(2,"Sedan");
		type.put(3,"Compact Suv");
		type.put(4,"Crossover");
	
		TreeMap<Integer,String> suv = new TreeMap<>();
		suv.put(1, "GLA");
		suv.put(2, "GlS");
		suv.put(3, "AMG G63");
		suv.put(4, "GLC");
		
		TreeMap<Integer,String> sedan = new TreeMap<>();
		sedan.put(1, "EQS");
		sedan.put(2, "A-Class Limousine");
		sedan.put(3, "C-CLass");
		sedan.put(4, "AMG A35");
		
		TreeMap<Integer,String> compactSuv = new TreeMap<>();
		compactSuv.put(1, "EQB");
		compactSuv.put(2, "GlB");
		compactSuv.put(3, "AMG GLA35");
		compactSuv.put(4, "GLC Couple");
		
		TreeMap<Integer,String> crossOver = new TreeMap<>();
		crossOver.put(1, "GLA 200 Sport");
		crossOver.put(2, "R-Class Diesel R350 CDi");
		crossOver.put(3, "CLS Shooting Brake");
		
		System.out.println("Enter the car model");
		for(Map.Entry m : type.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			}
		try {
		int cartype = sc.nextInt();
		if(cartype==1){
			for(Map.Entry suvm: suv.entrySet()) {
				System.out.println(suvm.getKey()+" "+suvm.getValue());
			}
			System.out.println("Enter the car you want to buy");
			int car=sc.nextInt();
			if(suv.containsKey(car)) {
				System.out.println("Congratulation on buying Mercedes "+suv.get(car));
				
			}
			else {
				System.out.println("We don't sell that product");
				}
			
		}
		else if(cartype==2){
			for(Map.Entry sedanm: sedan.entrySet()) {
				System.out.println(sedanm.getKey()+" "+sedanm.getValue());
			}
			System.out.println("Enter the car you want to buy");
			int car=sc.nextInt();
			if(sedan.containsKey(car)) {
				System.out.println("Congratulation on buying Mercedes "+sedan.get(car));
			}
			else {
				System.out.println("We don't sell that product");
				}
			
		}
		else if(cartype==3){
			for(Map.Entry comsuv: compactSuv.entrySet()) {
				System.out.println(comsuv.getKey()+" "+comsuv.getValue());
			}
			System.out.println("Enter the car you want to buy");
			int car=sc.nextInt();
			if(compactSuv.containsKey(car)) {
				System.out.println("Congratulation on buying Mercedes "+compactSuv.get(car));
			}
			else {
				System.out.println("We don't sell that product");
				}
			
		}
		else if(cartype==4){
			for(Map.Entry cross: crossOver.entrySet()) {
				System.out.println(cross.getKey()+" "+cross.getValue());
			}
			System.out.println("Enter the car you want to buy");
			int car=sc.nextInt();
			if(crossOver.containsKey(car)) {
				System.out.println("Congratulation on buying Mercedes "+crossOver.get(car));
			}
			else {
			System.out.println("We don't sell that product");
			}
	}
		else {
			System.out.println("We don't sell that product");
		}
		}
		catch(Exception e)
		{
			System.out.println("Please don't mess around by giving wrong !\nCome back when you got money \n-Mercedes Manager");
			
		}
	}
	void audi() {
		try {
		TreeMap<Integer,String> type = new TreeMap<>();
		
		type.put(1,"Suv");
		type.put(2,"Sedan");
		type.put(3,"Compact Suv");
		type.put(4,"Crossover");
	
		TreeMap<Integer,String> suv = new TreeMap<>();
		suv.put(1, "Q3");
		suv.put(2, "Q5");
		suv.put(3, "RS Q8");
		suv.put(4, "Q7");
		
		TreeMap<Integer,String> sedan = new TreeMap<>();
		sedan.put(1, "A8 L");
		sedan.put(2, "A6");
		sedan.put(3, "e-tron GT");
		sedan.put(4, "A4");
		
		TreeMap<Integer,String> compactSuv = new TreeMap<>();
		compactSuv.put(1, "Q5 Premium plus");
		compactSuv.put(2, "Q5 Technology");
		compactSuv.put(3, "Q5 Special Edition");
		
		TreeMap<Integer,String> crossOver = new TreeMap<>();
		crossOver.put(1, "Q5");
		
		System.out.println("Enter the car model");
		for(Map.Entry m : type.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			}
		int cartype = sc.nextInt();
		if(cartype==1){
			for(Map.Entry suvm: suv.entrySet()) {
				System.out.println(suvm.getKey()+" "+suvm.getValue());
			}
			System.out.println("Enter the car you want to buy");
			int car=sc.nextInt();
			if(suv.containsKey(car)) {
				System.out.println("Congratulation on buying AUDI "+suv.get(car));
			}
			else {
				System.out.println("We don't sell that product");
				}
			
		}
		else if(cartype==2){
			for(Map.Entry sedanm: sedan.entrySet()) {
				System.out.println(sedanm.getKey()+" "+sedanm.getValue());
			}
			System.out.println("Enter the car you want to buy");
			int car=sc.nextInt();
			if(sedan.containsKey(car)) {
				System.out.println("Congratulation on buying AUDI "+sedan.get(car));
			}
			else {
				System.out.println("We don't sell that product");
				}
		}
		else if(cartype==3){
			for(Map.Entry comsuv: compactSuv.entrySet()) {
				System.out.println(comsuv.getKey()+" "+comsuv.getValue());
			}
			System.out.println("Enter the car you want to buy");
			int car=sc.nextInt();
			if(compactSuv.containsKey(car)) {
				System.out.println("Congratulation on buying AUDI "+compactSuv.get(car));
			}
			else {
				System.out.println("We don't sell that product");
				}
			
		}
		else if(cartype==4){
			for(Map.Entry cross: crossOver.entrySet()) {
				System.out.println(cross.getKey()+" "+cross.getValue());
			}
			System.out.println("Enter the car you want to buy");
			int car=sc.nextInt();
			if(crossOver.containsKey(car)) {
				System.out.println("Congratulation on buying AUDI "+crossOver.get(car));
			}
			else {
				System.out.println("We don't sell that product");
			}
			
		}
		else {
			System.out.println("We don't sell that product");
		}
		}
		catch(Exception e) {
			System.out.println("Time is money !\nPlease don't waste our time by giving in invalid input \n-Audi Manager");
		}
		
	}
	void bmw() {
		try {
	TreeMap<Integer,String> type = new TreeMap<>();
		
		type.put(1,"Suv");
		type.put(2,"Sedan");
		type.put(3,"Compact Suv");
		type.put(4,"Crossover");
	
		TreeMap<Integer,String> suv = new TreeMap<>();
		suv.put(1, "X1");
		suv.put(2, "X5");
		suv.put(3, "X7");
		suv.put(4, "X4");
		
		TreeMap<Integer,String> sedan = new TreeMap<>();
		sedan.put(1, "7 Series");
		sedan.put(2, "3 Series");
		sedan.put(3, "5 Series");
		sedan.put(4, "i4");
		
		TreeMap<Integer,String> compactSuv = new TreeMap<>();
		compactSuv.put(1, "iX");
		compactSuv.put(2, "X3");
		compactSuv.put(3, "X6");
		
		TreeMap<Integer,String> crossOver = new TreeMap<>();
		crossOver.put(1, "X3 SDrive28i");
		crossOver.put(2, "X2 XDrive28i");
		crossOver.put(3, "X5 XDrive35D");
		
		System.out.println("Enter the car model");
		for(Map.Entry m : type.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			}
		int cartype = sc.nextInt();
		if(cartype==1){
			for(Map.Entry suvm: suv.entrySet()) {
				System.out.println(suvm.getKey()+" "+suvm.getValue());
			}
			System.out.println("Enter the car you want to buy");
			int car=sc.nextInt();
			if(suv.containsKey(car)) {
				System.out.println("Congratulation on buying BMW "+suv.get(car));
			}
			else {
				System.out.println("We don't sell that product");
				}
		}
		else if(cartype==2){
			for(Map.Entry sedanm: sedan.entrySet()) {
				System.out.println(sedanm.getKey()+" "+sedanm.getValue());
			}
			System.out.println("Enter the car you want to buy");
			int car=sc.nextInt();
			if(sedan.containsKey(car)) {
				System.out.println("Congratulation on buying BMW "+sedan.get(car));
			}
			else {
				System.out.println("We don't sell that product");
				}
			
		}
		else if(cartype==3){
			for(Map.Entry comsuv: compactSuv.entrySet()) {
				System.out.println(comsuv.getKey()+" "+comsuv.getValue());
			}
			System.out.println("Enter the car you want to buy");
			int car=sc.nextInt();
			if(compactSuv.containsKey(car)) {
				System.out.println("Congratulation on buying BMW "+compactSuv.get(car));
			}
			else {
				System.out.println("We don't sell that product");
				}
			
		}
		else if(cartype==4){
			for(Map.Entry cross: crossOver.entrySet()) {
				System.out.println(cross.getKey()+" "+cross.getValue());
			}
			System.out.println("Enter the car you want to buy");
			int car=sc.nextInt();
			if(crossOver.containsKey(car)) {
				System.out.println("Congratulation on buying BMW "+crossOver.get(car));
			}
			else {
				System.out.println("We don't sell that product");
				}
			
		}
		else {
			System.out.println("We dont sell that model");
		}
	}
		catch(Exception e) {
			System.out.println("You have enter a invalid input.\nWe request you to please enter a valid input from the given menu \n-BMW Manager");
		}
	}
}

public class CollectionQ14 {
	public static void main(String arg[]){
		Car c = new Car();
//		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter the brand\n1)Mercedes\n2)Audi\n3)BMW");
		int brand=c.sc.nextInt();
		
		if(brand==1) {
			c.mercedes();
		}
		else if(brand==2) {
			c.audi();
			
		}
		else if(brand==3) {
			c.bmw();
			
		}
		else {
			System.out.println("Sorry, Please enter a valid number");
		}
		}
		catch(Exception e) {
			System.out.println("Sorry you have given a invalid/wrong input");
		}
			
	}
}
