package org.ycpait.StudentManagementapp.entity;



import java.io.Serializable;

import java.util.List;



public class Student implements Serializable , Comparable<Student>{

	private static int count;

	

	//-------------attributes or Instance Variables

	private int rollNumber;

	private String name;

	private float marks;

	private List<String> subjects;

	

	

	public List<String> getSubjects() {

		return subjects;

	}



	public void setSubjects(List<String> subjects) {

		this.subjects = subjects;

	}



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

	

	//Parameterized constructor

	public Student(String name, float marks,List<String> subjects) {

		System.out.println("====== parameterized constructor =====");

		count++;

		this.rollNumber = count;

		this.name = name;

		this.marks = marks;

		this.subjects = subjects;

	}

	

	//Instance method

	public void display() {

		System.out.println(this.rollNumber+" | "+this.name+" | "+this.marks+" | "+this.subjects); //this line is equivalent to this.rollNumber, compiler does that implicitly. It is recommended to use explicitly this reference inside instance method

//		System.out.println(this.name);

//		System.out.println(this.marks);

	}

	

	//overloaded Method

	void display(String format) {

		System.out.println("Roll Number \t Name \t Marks \t Subjects");

		for(int i=0; i<=40; i++) {

			System.out.print(format);

		}

		System.out.println();

		System.out.println(this.rollNumber+" \t "+this.name+" \t "+this.marks+"\t"+subjects);

	}

	

	@Override

	public String toString() {

		System.out.println("in toString");

		

		return this.rollNumber+" | "+this.name+" | "+this.marks;

	}



	@Override

	public int compareTo(Student o) {

		// TODO Auto-generated method stub

		return (int) (marks - o.marks);

	}

	



//	public int compare(Student s1,Student s2) {

//		// TODO Auto-generated method stub

//		return (int) (s1.name.compareTo(s2.name));

//	}



	@Override

	public int hashCode() {

		return this.name.length();

	}

	

	@Override

	public boolean equals(Object o) {

		Student s = (Student)o; //Down-casting

		return this.name.equals(s.name);

	}

}