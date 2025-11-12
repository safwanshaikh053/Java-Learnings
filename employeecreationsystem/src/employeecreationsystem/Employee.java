package employeecreationsystem;

public class Employee {
    private static int count;
	protected int id;
	protected String name;
	protected double basicSalary;

	
	Employee(String name, double basicSalary){
		count++;
		this.id=count;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
	public void showDetails(String format){
			System.out.println("id \t Name \t basicSalary ");
			for(int i=1; i<=40;i++) {
				System.out.print(format);
			}
			System.out.println();//for next line
			System.out.println(this.id+ "\t \t" + this.name+ "  \t"+ this.basicSalary + "\t \t"  );
		
	}
	public double calculateSalary() {
		return basicSalary;
	}
}
