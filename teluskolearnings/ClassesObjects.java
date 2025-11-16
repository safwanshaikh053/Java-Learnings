package teluskolearnings;

import java.util.Scanner;



public class ClassesObjects {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		 int sum = obj.add(5,10,5);
		 int sub = obj.sub(5,10);
		 int mult = obj.mult(5, 10);
		 int mult3 = obj.mult(5, 10, 2);
		 
		 
		 System.out.println("sum : " +sum);
		 System.out.println("sub : " +sub);
		 System.out.println("mult : " + mult);
		 System.out.println("mult3 : " + mult3);
		
	}

}
