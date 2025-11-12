
public class Rectangle extends Shape{
	 private float length;
	 private float breadth;
	// private String color;
	 
	 public Rectangle(float length, float breadth, String color) {
		 super(color);
		 this.length=length;
		 this.breadth=breadth;
		 //this.color=color;
	 }
	 
	 public float calculateArea() {
		 return length*breadth;
	 }
	 
	 /*
	 public void draw() {
		 System.out.println("Rectangle drawn using color:"+ this.color);
	 }
	 */
	 
}
