
public class geometryapplicatio {

	public static void main(String[] args) {
		
		Circle c;
		c = new Circle(10.0f,"Blue");
		
		
		System.out.println("Area of Circle :"+ c.calculateArea()); 
		c.draw();
		
		/*
		Rectangle r;
		r=new Rectangle(10.0f, 20.0f, "Red");
		
		System.out.println("Area of Rectangle:"+ r.calculateArea());
		r.draw();
		*/
	}

}
