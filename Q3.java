/*3)Write a program to create a class named shape. In this class we have three
sub classes circle, triangle and square each class has two member function
//named area() and perimeter(). Create these using polymorphism concepts.*/


package CoreJavaTask;
import java.util.*;

abstract class Shape{
	protected double area;
	protected double perimeter;
	//abstract double getArea();
	//abstract double getPerimeter();
}
class circle extends Shape{
	double area(double radius) {
		area=3.14*radius*radius;
		return area;
		
	}
	double perimeter(double radius) {
		perimeter=2*3.14*radius;
		return perimeter;
	}
	
	
	}

class Triangle extends Shape{
	double area(int base, int height) {
		area=0.5*base*height;
		return area;
		
	}
	double perimeter(int base, int height, int hypotenuse) {
		perimeter=base+height+hypotenuse;
		return perimeter;
	}
	
	
	}
	
class Square extends Shape{
	double area(int side) {
		area=side*side;
		return area;
		
	}
	double perimeter(int side) {
		perimeter=4*side;
		return perimeter;
	}
	
	
	}



public class Q3 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the choice \n1.Circle \n2.Triangle \n3.Square");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			circle c = new circle();
			System.out.println("Enter the radius");
			int cr=sc.nextInt();
			System.out.println("The area of the circle is ="+c.area(cr));
			System.out.println("The perimeter of the circle is ="+c.perimeter(cr));
			break;
			
		case 2:
			Triangle t = new Triangle();
			System.out.println("Enter the base, height, hypotenuse");
			int tb=sc.nextInt();
			int th=sc.nextInt();
			int thy=sc.nextInt();
			System.out.println("The area of the Triangle is ="+t.area(tb,th));
			System.out.println("The perimeter of the Triangle is ="+t.perimeter(tb,th,thy));
			break;
			
		case 3:
			Square s = new Square();
			System.out.println("Enter the side");
			int ss=sc.nextInt();
			System.out.println("The area of the square is ="+s.area(ss));
			System.out.println("The perimeter of the square is ="+s.perimeter(ss));
			break;
		
		
		}
			
		

	}

}
