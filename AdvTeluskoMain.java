package teluskolearnings;

public class AdvTeluskoMain {

	public static void main(String[] args) {
		
		SquareCalc obj = new SquareCalc();
		int add = obj.add(5, 25);
		int sub = obj.sub(20, 5);
		int mult = obj.mult(2, 6);
		int div = obj.div(20, 2);
		int area = obj.area(5);
		
		System.out.println("Addition : " + add);
		System.out.println("Subtraction : " + sub);
		System.out.println("Multiplication : " + mult);
		System.out.println("Division : " + div);
		System.out.println("Area of Square : " + area);
	}
	

}


