public class CommissionEmployee  {
	
	private String firstName; 
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commisionRate;
	private double earning;
	
	public CommissionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double grossSales,
			double commisionRate) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
		
	}
	
	public CommissionEmployee() {
		
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}


	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}


	public double getCommisionRate() {
		return commisionRate;
	}


	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}
	
	public double earnings() {                                                                   
	     return getCommisionRate() * getGrossSales();
	}

	 public double getEarning() {
		return commisionRate*grossSales;
	} 


	public void setEarning(Double earning) {
		this.earning = earning;
	} 

	
	
	/* public String toString() {                                    
	      return String.format("%s: %s\n%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
	    		  "First name",firstName,
	    		  "Last name",lastName,
	    		  "Social security number",socialSecurityNumber,
	    		  "Gross sales",grossSales,
	    		  "CommissionRate",commisionRate,
	    		  "Earnings",earning); 
	} */
	
	 public String toString() {
		return "\nFirst name: " + firstName 
				+ "\nLast name: " + lastName
				+ "\nSocial security number: " + socialSecurityNumber
				+ "\nGross sales: " + grossSales
				+ "\nCommission Rate: " + commisionRate;
				
		
	}

}
