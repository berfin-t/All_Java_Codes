
public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstN, String lastN, String ssn, double grossS, double commissionR, double baseS) {
		super(firstN, lastN, ssn, grossS, commissionR);
		setBaseSalary(baseS);
		
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseS) {
		this.baseSalary = baseS;
	}
	
	public String toString() {
		return "\nBase-Salaried Commission Employee: " + super.toString()
				+ "\nBase Salary: " + getBaseSalary();
 	}
	
	@Override
	public double getPaymentAmount() {
		
		return baseSalary+super.getPaymentAmount();
	}

}
