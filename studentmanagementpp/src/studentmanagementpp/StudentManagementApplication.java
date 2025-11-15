package studentmanagementpp;

import java.util.Scanner;

import org.aitycp.studentmanagementapp.exception.StudentNotFoundException;

import static studentmanagementpp.Student.getCount;

public class StudentManagementApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Number of students register :"+Student.getCount());
		System.out.println("Number of students register :"+getCount());
		
		Student[] students = new Student[2];
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		
		
		//1. Create a reference of student type
		Student s;
		System.out.println("Before");
		//2. create object and assign to reference variable
		s = new Student("Alice", 20.0f);
//		Student s = new Student(); No Parameterized constructor won't work now since it does not exist
//		System.out.println(s);//
		s.display();
//		System.out.println(s.rollNumber);
//		System.out.println(s.name);
//		System.out.println(s.marks);
		
		//s.rollNumber = -1; // To stop this we make sure rollNumber is not accessible outside the class in which it is declared
		//s.name = "Alice";
		//s.marks = 98.43f;
//		s.accept(1, "Alice", 20.0f);
//		s.display();
		
//		Student s1 = new Student(2, "Bob", 56.78f);
		
//		s1.accept(2, "Bob", 56.78f);
//		s1.display("=");
		
		
		
//		Student s2 = new Student(3, "Ajay", 56.61f);
//		s2.display("=");
		
		
		Student stud1 = null;
		Scanner sc = new Scanner(System.in);
		int choice;
		int count =0;
		do {
		
			 System.out.println("Welcome to Student Management System");
			 System.out.println("======================================");
			 System.out.println("1. Register New Student");
			 System.out.println("2. Display Details");
			 System.out.println("3. Search Student by Roll. no");
			 System.out.println("-1. Exit");
			 System.out.println("Enter your choice");
			 choice = sc.nextInt();
			 switch(choice) {
			 	case 1: 
				 	System.out.println("Case 1");
			 		
			 		if(count<=students.length) {
					 	students[count] = new Student("Bob",60000);
					 	count++;
			 		}
			 		else {
			 			System.err.println("Limit Exceeded");
			 		}
			 		break;
			 	case 2:
			 		for(Student stud: students)
			 		if(stud!=null)
//			 			stud1.display();
			 			System.out.println(stud.toString());
			 		break;
			 	case 3:
			 		System.out.println("Enter Roll no : ");
			 		int r =  sc.nextInt();
			 		
			 		boolean isFound = false;
			 		
			 		for(Student foundStudent : students) {
			 			if(foundStudent != null) {
			 				if(foundStudent.getRollNumber()==r) {
			 					System.out.println(foundStudent);
			 					isFound = true;
			 					break;
			 				}
			 				
			 			}
			 		}
			 		//}
			 		if(!isFound) {
			 			StudentNotFoundException e = new StudentNotFoundException("Student with rollNumber "+ r+ " Not found");
			 			try {
			 				throw e;
			 			}
			 			catch(StudentNotFoundException ex) {
			 				ex.printStackTrace();
			 			}
			 		}
			 		
			 		break;
			 	case -1:
			 		System.out.println("Thank You");
			 }
			
		}while(choice!=-1);
	}

}