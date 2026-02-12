package teluskolearnings;

public class ObjectOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students();
		s1.rollNo = 1;
		s1.name = "Abdullah";
		s1.marks = 89;
		
		Students s2 = new Students();
		s2.rollNo = 2;
		s2.name = "Zaid";
		s2.marks = 95;
		
		Students s3 = new Students();
		s3.rollNo = 1;
		s3.name = "Hadi";
		s3.marks = 97;
	
		
		Students students[] = new Students[3];
		students [0] = s1;
		students [1] = s2;
		students [2] = s3;
		
		
		//	for(int i=0; i<students.length; i++) {
		//		System.out.println(students[i].name + " " +  students[i].marks);
		//	}
		
		// Enhanced For Loop or Advanced For Loop
		for(Students std : students) {
			System.out.println(std.rollNo +" "+ std.name + " " +  std.marks);
		}
	}
}
