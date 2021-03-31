
public class CommissionEmployee extends Employee{
	
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstN, String lastN, String ssn, double grossS, double commissionR) {
		super(firstN, lastN, ssn);
		setGrossSales(grossS);
		setCommissionRate(commissionR);
		
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossS) {
		grossSales =  grossS;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionR) {
		commissionRate = commissionR;
	}
	
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	public String toString() {
		return "\nCommission Employee: " + super.toString()
		+ "\nGross Sales: " + getGrossSales() 
		+ "\nCommission Rate: " + getCommissionRate();
 	}

}
