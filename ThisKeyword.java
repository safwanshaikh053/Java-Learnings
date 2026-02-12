package teluskolearnings;

public class ThisKeyword {
	private int rollNo;
	private String name;
	private float marks;
	
	
	
	//Constructors
	
	public ThisKeyword() {
		super();
	}
	
	public ThisKeyword(int rollNo) {
		super();
		this.rollNo = rollNo;
	}

	public ThisKeyword(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public ThisKeyword(int rollNo, String name, float marks) {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(marks);
	}

	

	
	
	
//	public void display(int rollNo, String name, float marks) {
//		System.out.println(rollNo);
//		System.out.println(name);
//		System.out.println(marks);
//	}
	
	
//	public void setRollNo(int rollNo){
//		this.rollNo = rollNo;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name, float marks) {
//		this.name = name;
//		this .marks = marks;
//	}
//	public float getMarks() {
//		return marks;
//	}
////	public void setMarks(float marks) {
////		this.marks = marks;
////	}
//	public int getRollNo(){
//		//System.out.println(rollNo);
//		return rollNo;
//	}


}
