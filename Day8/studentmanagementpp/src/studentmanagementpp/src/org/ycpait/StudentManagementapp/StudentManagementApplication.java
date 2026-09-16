package org.ycpait.StudentManagementapp;
import static org.ycpait.StudentManagementapp.entity.Student.getCount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.ycpait.StudentManagemantApp.dao.impl.StudentDaoImpl;
import org.ycpait.StudentManagementapp.Exception.StudentNotFoundException;
import org.ycpait.StudentManagementapp.entity.Student;

public class StudentManagementApplication {

public static void main(String[] args) {

// System.out.println("Number of students register :"+Student.getCount());
System.out.println("Number of students register :"+getCount());

//Student[] students = new Student[2];
List<Student> Students = new ArrayList<Student>();

// System.out.println(Students[0]);
// System.out.println(Students[1]);


//1. Create a reference of student type
//Student s;
//System.out.println("Before");
//2. create object and assign to reference variable
//s = new Student("Alice", 20.0f);
// Student s = new Student(); No Parameterized constructor won't work now since it does not exist
// System.out.println(s);//
//s.display();
// System.out.println(s.rollNumber);
// System.out.println(s.name);
// System.out.println(s.marks);

//s.rollNumber = -1; // To stop this we make sure rollNumber is not accessible outside the class in which it is declared
//s.name = "Alice";
//s.marks = 98.43f;
// s.accept(1, "Alice", 20.0f);
// s.display();

// Student s1 = new Student(2, "Bob", 56.78f);

// s1.accept(2, "Bob", 56.78f);
// s1.display("=");



// Student s2 = new Student(3, "Ajay", 56.61f);
// s2.display("=");
List<Student> students = new ArrayList<Student>();
StudentDaoImpl dao = new StudentDaoImpl();

Student stud1 = null;
Scanner sc = new Scanner(System.in);
int choice = -1;

do {

System.out.println("Welcome to Student Management System");
System.out.println("======================================");
System.out.println("1. Register New Student");
System.out.println("2. Display Details");
System.out.println("3. Search Student By Roll Number");
System.out.println("4. Delete Student By Roll Number");
System.out.println("5. Sort Students by marks");
System.out.println("6. Sort Students by Name");
System.out.println("7. Show Top scoring students");
System.out.println("8. Show Students Name with more than 90");
System.out.println("-1. Exit");
System.out.println("======================================");
System.out.println("Enter your choice");
choice = sc.nextInt();
switch(choice) {
case 1:
System.out.println("Enter Name");
String name = sc.next();
System.out.println("Enter Marks");
Float marks = sc.nextFloat();

List<String> subjects = new ArrayList<String>();
subjects.add("Java");
subjects.add("Spring");
Student s = new Student(name,marks,subjects);

//Students.add(s);
dao.save(s);
break;
case 2:
for(Student stud: dao.findAll()) {
if(stud!=null)
stud.display();
// System.out.println(stud);

}
break;
case 3:
System.out.println("Enter Roll number");
int r = sc.nextInt();

try {
Student searchedStudent = dao.findOne(r);
System.out.println(searchedStudent);
} catch (StudentNotFoundException e) {
e.printStackTrace();
}

break;
case 4:
System.out.println("Enter Roll Number to Delete");
int rollNumberToDelete = sc.nextInt();
dao.deleteOne(rollNumberToDelete);
break;
case 5 :
Collections.sort(Students);
for (Student Stud : Students) {
if(Stud !=null)
System.out.println(Stud);
}
break;
case 6 :
Collections.sort(Students,(s1,s2)-> s1.getName().compareTo(s2.getName()));
for (Student Stud : Students) {
if(Stud !=null)
System.out.println(Stud);
}
break;
case 7 :
Students.stream()
       .filter(stu -> stu.getMarks()>90)
       .toList()
       .forEach(stud -> System.out.println(stud));
break;
case 8 :
List<String> topScoringStudentName = Students.stream()
                                            .filter(stu -> stu.getMarks()>90) //These are two intermediate operation
                                            .map(st -> st.getName()) // These are two intermediate operation
                                            .toList();

topScoringStudentName.forEach(n -> System.out.println(n));
break;


case -1:
System.out.println("Thank You visit again");
}

}while(choice!=-1);
}

}