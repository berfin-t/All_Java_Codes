
public class SalariedEmployee extends Employee{
	
private double weeklySalary;
	
	public SalariedEmployee(String firstN, String lastN, String ssn, double salary) {
		super(firstN, lastN, ssn);
		setWeeklySalary(salary);
		
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	public String toString() {
		return "\nSalaried Employee: " + super.toString() 
				+ "\nWeekly Salary: " + getWeeklySalary();
	}

	@Override
	public double getPaymentAmount() {
		
		return getWeeklySalary();
	}

}
