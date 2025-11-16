package teluskolearnings;

public class TwoDimensionalArrays {

	public static void main(String[] args) {


		int num [][] = new int [4][6];
		
		//initially the values in the arrays are 0.
		
		// To print the array -->
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<6; j++) {
				System.out.print(num [i][j] + " ");
			}
			System.out.println();
		}

	}

}
