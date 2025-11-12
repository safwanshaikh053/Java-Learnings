package employeecreationsystem;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=null;
		/*emp = new Employee("Junaid", 90738.6483);
		emp.showDetails("=");
		System.out.println(emp.calculateSalary());*/
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Welcome to Employee Management System");
			System.out.println("=====================================");
			System.out.println("1. Register new Empoyee");
			System.out.println("2. Display Details");
			System.out.println("-1. Exit");
			System.out.println("Enter Your Choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				emp = new Employee("Junaid", 90738.6483);
				break;
			case 2:
				if(emp!=null) {
					emp.showDetails("=");
				}
				else {
					System.out.println("Enter a valid Employee");
				}
				break;
			case -1:
				System.out.println("Thank you visit again!");
			}
		}while(choice!=-1); 
	}
}
