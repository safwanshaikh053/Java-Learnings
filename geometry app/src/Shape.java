
public class Shape {
	protected String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public void draw() {
		System.out.println("Circle Drawn using color:"+ this.color);
	}
}
