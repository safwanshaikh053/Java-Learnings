package studentmanagementpp;

public class Student {
	
	private static int count;
	//attributes
	 private int rollNumber;
	 private String name;
	 private float marks;
	 
	 
	 
	 /*
	  Student(){
		 System.out.println("This is constructor ");
		 this.rollNumber=3;
		 this .name="Guest";
		 this.marks=79.97f;
	 }
	 */
	 //parameterized constructor
	public  Student(int rollNumber, String name, float marks){
		 //System.out.println("This is Parameterized constructor");
		 count++;
		 this.rollNumber=count;
		 this.name=name;
		 this.marks=marks;
	 }
	 
	public void setMarks(float marks) {   //setter
		 this.marks=marks;
	 }
	 public float getMarks() {         //getter
		 return this.marks;
	 }
	 public void setName(String name) {       //setter
		 this.name=name;
	 }
	 
	 public String getName() {			//getter
		 return this.name;
	 }
	 
	 private static void setRollNumber(int count) {		//setter
		 Student.count=count;
	 }
	 
	 public int getRollNumber() {				//getter
		 return this.rollNumber;
	 }
	 public static int getCount() {
		 return count;
	 }
	 void accept(int rollNumber, String name, float marks) {
		 this.rollNumber=rollNumber;
		 this.name=name;
		 this.marks=marks;
	 }
	 
	//method definition
	//instance method
	void display(){
		System.out.println(this.rollNumber);
		System.out.println(this.marks);
		System.out.println(this.name);
	}
	
	void display(String format) {					//method overloading
		System.out.println("Roll.No \t Name \t Marks");
		for(int i=1; i<=40;i++) {
			System.out.print(format);
		}
		System.out.println();//for next line
		System.out.println(this.rollNumber+ "\t \t" + this.name+ "  \t"+ this.marks);
	}
}
