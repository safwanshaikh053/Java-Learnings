package teluskolearnings;

import java.util.Scanner;

public class Calculator{
	public int num1;
	public int num2;
	public int sum;
	
	public Calculator() {
		
	}
	
	public int add(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
	public int add(int n1, int n2, int n3) {
		int sum = n1 + n2 + n3;
		return sum;
	}
	
	public int sub(int n1, int n2) {
		int sub = n1 - n2;
		return sub;
	}
	
	public int mult(int n1, int n2) {
		int mult = n1 * n2;
		return mult;
	}
	
	public int mult(int n1, int n2, int n3) {
		int mult = n1 * n2 * n3;
		return mult;
	}
}
