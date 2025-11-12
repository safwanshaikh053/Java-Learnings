
public class Circle extends Shape {

	public float radius;
	//public String color;

	
	public Circle(float radius, String color){
		super(color);
		this.radius=radius;
		//this.color=color;
	}
	
	public float calculateArea() {
		return 3.14f*radius*radius;
	}
	
	@Override 
	
	public void draw() { 		  //overridden method
		super.draw();
		System.out.println("with Radius " + this.radius);
	}
	
}
