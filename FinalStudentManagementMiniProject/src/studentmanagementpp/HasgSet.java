package studentmanagementpp;

import java.util.HashSet;
import java.util.Set;

public class HasgSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> students = new HashSet<Student>();
		
		Student s1 = new Student("Amit", 88);
		Student s2 = new Student("Amit", 67);
	
		students.add(s1);
		students.add(s2);
		System.out.println(students.size());
}

}
