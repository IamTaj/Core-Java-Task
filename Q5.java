/*5)Create class box and box3d. box3d is extended class of box. The above
two classes going to full fill following requirement
 Include constructor.
 set value of length, breadth, height
 Find out area and volume.
Note: Base class and sub classes have respective methods and instance
variables.*/

package CoreJavaTask;
class box{
	int length;
	int breadth;
	int height;
	
	public void box(int l, int b, int h) {	
		this.length=l;
		this.breadth=b;
		this.height=h;
	}
	double area() {
		int ar=length*breadth;
		return ar;	
	}
		
	}

class box3d extends box{
	public box3d(int l,int b, int h) {
	this.length=l;
	this.breadth=b;
	this.height=h;
	}
	double volume() {
		double vol=length*breadth*height;
		return vol;
	}
	}
	

public class Q5 {
	public static void main(String arg[]) {
		
	box3d b = new box3d(2,4,7);
	System.out.println(b.volume());
	System.out.println(b.area());
	}
}