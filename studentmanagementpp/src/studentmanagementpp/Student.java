package studentmanagementpp;

public class Student {
	private static int count;
	
	
	
	//-------------attributes or Instance Variables
	private int rollNumber;
	private String name;
	private float marks;
	
	
	
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	//--------------Get Account--------------
	public static int getCount() {
		return count;
	}
	
	void accept(int rollNumber, String name, float marks){
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}
	
	//no-arg constructor
//	Student(){
//		System.out.println("Inside Student constructor");
//		this.rollNumber = 3;
//		this.name = "Default";
//		this.marks = 97.3f;
//	}
	
	public Student(String name, float marks) {
		System.out.println("====== parameterized constructor =====");
		count++;
		this.rollNumber = count;
		this.name = name;
		this.marks = marks;
	}
	
	//Instance method
	void display() {
		System.out.println(this.rollNumber+" | "+this.name+" | "+this.marks); //this line is equivalent to this.rollNumber, compiler does that implicitly. It is recommended to use explicitly this reference inside instance method
//		System.out.println(this.name);
//		System.out.println(this.marks);
	}
	
	void display(String format) {
		System.out.println("Roll Number \t Name \t Marks");
		for(int i=0; i<=40; i++) {
			System.out.print(format);
		}
		System.out.println();
		System.out.println(this.rollNumber+" \t "+this.name+" \t "+this.marks);
	}
	
	@Override
	public String toString() {
		System.out.println("in toString");
		
		return this.rollNumber+" | "+this.name+" | "+this.marks;
	}

}