
public class SalariedEmployee extends Employee{

	private double weeklySalary;
	
	public SalariedEmployee(String firstN, String lastN, String ssn, double salary) {
		super(firstN, lastN, ssn);
		setWeeklySalary(salary);
		
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double salary) {
		this.weeklySalary = salary;
	}
	
	public double earnings() {
		return getWeeklySalary();
	}
	
	public String toString() {
		return "\nSalaried Employee: " + super.toString() 
				+ "\nWeekly Salary: " + getWeeklySalary();
	}
	
	
}
