
public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private Double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName,String lastName,
			String socialSecurityNumber, Double grossSales,
			Double commisionRate, Double baseSalary) {
		
		super(firstName,lastName,socialSecurityNumber,
				grossSales, commisionRate);
		
		if (baseSalary < 0.0) 
			System.out.println("Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
		
	}	
		public Double getBaseSalary() {
			return baseSalary;
		}
		
	public void setBaseSalary(Double baseSalary) {
			
			if (baseSalary < 0.0) 
				System.out.println("Base salary must be >= 0.0");
			this.baseSalary = baseSalary;
	}

		
}
