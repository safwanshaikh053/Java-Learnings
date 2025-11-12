package studentmanagementpp;

public class StudentManagementApplication {

	public static void main(String[] args) {
		System.out.println("Number of students registered are "+ Student.getCount());
		//1. create a reference of a student type
		/*Student s;
		Student s1;
		Student s2;*/
		Student s3;
		//2. Create object and Assign to reference variable
		
		//s=new Student(); //constructor is called is here
		//s1=new Student();
		//s2=new Student();
		s3=new Student(4,"Abhay",95.03f);    //Parameterized constructor is called here
		/*
		System.out.println(s.rollNumber);
		System.out.println(s.marks);
		System.out.println(s.name);
		*/
		
		//s.rollNumber=-1; //to stop this we make sure rollNumber is not accessible 
						 //outside the class in which it is declared
		//s.marks=89.25f;
		//s.name="Amit";
		/*s.accept(1, "Amit", 87.37f);
		s.display(); //invoking display() method
		
		s1.accept(2, "Rahul", 79.39f);
		s1.display();
		
		//s2.accept();
		s2.display();*/
		s3.display("=");
	}
	

}
