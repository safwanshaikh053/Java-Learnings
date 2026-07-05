package org.aitycp.geometryapplicatio.entity;
public abstract class Shape {
	protected String color;
	
	public Shape(String color) {
		
		super();
		this.color = color;
	}
	
	public abstract float calculateArea();
	
	public void draw() {
		System.out.println("Circle Drawn using color:"+ this.color);
	}
}
