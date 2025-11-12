package employeecreationsystem;

public class WageEmployee extends Employee {
	protected int hours;
	private int rate;
	
	public WageEmployee(int hours, int rate, String name, double basicSalary) {
		super(name, basicSalary);
		this.hours=hours;
		this.rate=rate;
	}
		
	@Override
		public double calculateSalary() {
			return basicSalary * this.hours * this.rate;
	}
	
		@Override
		public void showDetails(String format){
			System.out.println("id \t Name \t basicSalary  \t hours  \t rate");
			for(int i=1; i<=40;i++) {
				System.out.print(format);
			}
			System.out.println();//for next line
			System.out.println(this.id+ "\t \t" + this.name+ "  \t"+ this.basicSalary + "\t \t" + this.hours );
		
	}
}
