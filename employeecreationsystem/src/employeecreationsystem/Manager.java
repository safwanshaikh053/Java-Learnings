package employeecreationsystem;

public class Manager extends Employee {
	private int incentives;
	
	public Manager(int incentives, String name, double basicSalary) {
		super(name,basicSalary);
		this.incentives=incentives;
	}
	
	public double calculateSalary() {
		return basicSalary + this.incentives;
	}
	public void showDetails(String format){
		System.out.println("id \t Name \t basicSalary   \t incentives");
		for(int i=1; i<=40;i++) {
			System.out.print(format);
		}
		System.out.println();//for next line
		System.out.println(this.id+ "\t \t" + this.name+ "  \t"+ this.basicSalary + "\t \t" + this.incentives );
	
}
}

