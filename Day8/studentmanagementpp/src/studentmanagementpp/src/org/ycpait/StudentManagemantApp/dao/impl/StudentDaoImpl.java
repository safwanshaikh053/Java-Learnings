package org.ycpait.StudentManagemantApp.dao.impl;

import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;



import org.ycpait.StudentManagementapp.Exception.StudentNotFoundException;

import org.ycpait.StudentManagementapp.entity.Student;



public class StudentDaoImpl {



	private List<Student> students;

	

	public StudentDaoImpl() {

		this.students = new ArrayList<Student>();

	}

	

	public void save(Student s) {

		this.students.add(s);

	}

	

	public List<Student> findAll() {

		return students;

	}

	

	public Student findOne(int rollNumber)throws StudentNotFoundException  {

		//searching student in array

 		for(Student foundStudent : students) {

 			if(foundStudent != null) {

 				//if student roll from array is eq to accepted

 				if(foundStudent.getRollNumber() == rollNumber) {

 					//System.out.println(foundStudent);

 					return foundStudent;

 				}

 			}

 		}

 		// generate Exception

 			StudentNotFoundException e = new StudentNotFoundException("student with rollNumber " + rollNumber + " NOT FOUND");

 			throw e;

 			

 		}

	

	public void deleteOne(int rollNumber) {

	Iterator<Student> i = students.iterator();

	

		while(i.hasNext()) {

			Student studentTobeDeleted = i.next();

			if(studentTobeDeleted.getRollNumber() == rollNumber);

				i.remove();

			}

	}

}