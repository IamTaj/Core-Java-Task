/*Parking Slot
	 * 1.there are two basement b1 and b2 both contains 30 slots
	 * 2.b1 for bikes and b2 for cars
	 * 3.allocate a vehicle with slots and generate a receipt and don't allocate at the same place
	 * 4.and store the data in  a file*/



package CoreJavaTask;
import java.util.*;

public class CollectionQ15 {
	
		void parkingSlot() {
			Scanner sc = new Scanner(System.in);
			TreeMap<Integer, Integer> b1 = new TreeMap<>();
			TreeMap<Integer, Integer> b2 = new TreeMap<>();
			ArrayList<Integer> ar = new ArrayList<>();
			int basement;
			int slot;
			String end="y";
			for(int i =1;i<=30;i++) {
				b1.put(i, i);
				b2.put(i, i);
			}
			
			try {
			System.out.println("Bike --> 1\nCar --> 2\nEnter the type of veichle");
			basement=sc.nextInt();
			
			switch(basement) {
			case 1:
				for(Map.Entry m: b1.entrySet()) {
					System.out.println("Slot no :"+m.getKey());
				}
				System.out.println("Enter the slot you want :");
				slot=sc.nextInt();
				
				while(true) {
				if(b1.containsKey(slot)) {
					ar.add(slot);
					System.out.println("The slot is been book");
					b1.remove(slot);
					System.out.println("Enter 'y' to add more or 'n' to exit");
					end=null;
					end=sc.next();
					if(end.equals("n")) {
						break;
					}
					for(Map.Entry m: b1.entrySet()) {
						System.out.println("Slot no :"+m.getKey());
					}
					System.out.println("Enter the slot you want :");
					slot=sc.nextInt();
					}
				else if(slot>30) {
					System.out.println("We are only limited to 30 slots\n Please enter a valid slot");
					System.out.println("Enter another slot :");
					slot=sc.nextInt();
				}
				else {
					System.out.println("Sorry this slot is already booked");
					System.out.println("Enter another slot :");
					slot=sc.nextInt();
				}
			}
				break;
			case 2:
				for(Map.Entry m: b2.entrySet()) {
					System.out.println("Slot no :"+m.getKey());
				}
				System.out.println("Enter the slot you want :");
				slot=sc.nextInt();
				
				while(true) {
				if(b2.containsKey(slot)) {
					ar.add(slot);
					System.out.println("The slot is been book");
					b2.remove(slot);
					System.out.println("Enter 'y' to add more or 'n' to exit");
					end=null;
					end=sc.next();
					if(end.equals("n")) {
						break;
					}
					for(Map.Entry m: b2.entrySet()) {
						System.out.println("Slot no :"+m.getKey());
					}
					System.out.println("Enter the slot you want :");
					slot=sc.nextInt();
					}
				else if(slot>30) {
					System.out.println("We are only limited to 30 slots\n Please enter a valid slot");
					System.out.println("Enter another slot :");
					slot=sc.nextInt();
				}
				else {
					System.out.println("Sorry this slot is already booked");
					System.out.println("Enter another slot :");
					slot=sc.nextInt();
				}
			}
				break;
				
			}
			System.out.println("*************************************************************************");
			System.out.println("\t\tBooking Successful \nYour slots for basement "+basement+" are :");
			int i=1;
			Collections.sort(ar);
			
			for(Integer val : ar) {
				System.out.println(i+") Slot :"+val);
				i++;
			}
			System.out.print("****************************************************************************");
			}
			catch(Exception e) {
				System.out.println("Please enter only numbers");
				parkingSlot();
			}
			
			
		}
		public static void main(String arg[]) {
			CollectionQ15 q = new CollectionQ15();
			q.parkingSlot();
		}
		
	}

