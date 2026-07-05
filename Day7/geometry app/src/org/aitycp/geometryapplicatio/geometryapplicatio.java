package org.aitycp.geometryapplicatio;

import org.aitycp.geometryapplicatio.entity.Circle;
import org.aitycp.geometryapplicatio.entity.Shape;

public class geometryapplicatio {

	public static void main(String[] args) {
		Circle circle1 = new Circle(3.5f, "red");
		System.out.println("Area of circle is " + circle1.calculateArea());
		circle1.draw();
		
		/*Rectangle rect1 = new Rectangle(3.3f, 3.2f, "blue");
		System.out.println("Area of circle is " + rect1.calculateArea());
		rect1.draw();*/
		
		//Shape circle2 = new Shape(3.5f, "red");// this will give error bcoz shape is abstract
		Shape circle2 = new Circle(3.5f, "red");
		System.out.println("Area of circle is " + circle2.calculateArea());
		circle1.draw();
		
		//upcasting
		Shape shape;
		Circle circle4 = new Circle(3.29f, "blue");
		
		shape = circle4;
		
		//downcasting
		Circle circle5 = (Circle)shape;
	}

}
