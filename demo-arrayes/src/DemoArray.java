
public class DemoArray {

	public static void main(String[] args) {
		
		//if we don't pass values to this array an exception is generated
		System.out.println(args[0]);
		
		//WAY-1 of declaring Array
		
		int[] numbers;
		numbers=new int[3];
		
		//int[] numbers=new int[3];
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		//numbers[3]=40;  Exception out of array length
	
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
	
	
		//WAY-2 of declaring Array
		
		float[] marks = new float[2];
		
		marks[0] = 89.32f;
		marks[1] = 78.65f;
		
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		
		//WAY-3 of declaring Array
		
		String[] subjects= {"Java","Spring","C++","Python","MySQL","MongoDB"};
		
		//System.out.println(subjects[0]);
		//System.out.println(subjects[1]);
		/*
		for(int i=0; i<subjects.length;i++) {   //to print Array
			System.out.println(subjects[i]);
		}
		*/
		//enhanced for loop OR for-in loop
		//added in JDK 5
		
		for(String s : subjects) {           //to print Array
			System.out.println(s);
		}
	}
}
