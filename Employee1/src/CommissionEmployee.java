
public class CommissionEmployee { 

	private String firstName; 
	private String lastName;
	private String socialSecurityNumber;
	private Double grossSales;
	private Double commisionRate;
	private Double earning;
	
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


	public Double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(Double grossSales) {
		this.grossSales = grossSales;
	}


	public Double getCommisionRate() {
		return commisionRate;
	}


	public void setCommisionRate(Double commisionRate) {
		this.commisionRate = commisionRate;
	}


	public Double getEarning() {
		return commisionRate*grossSales;
	}


	public void setEarning(Double earning) {
		this.earning = earning;
	}

	public CommissionEmployee(String firstName, String lastName,
			String socialSecurityNumber, Double grossSales,
			Double commisionRate) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
		
	}
	
	
	public String toString() {                                    
	      return String.format("%s: %s\n%s: %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
	    		  "First name",firstName,
	    		  "Last name",lastName,
	    		  "Social security number",socialSecurityNumber,
	    		  "Gross sales",grossSales,
	    		  "CommissionRate",commisionRate,
	    		  "Earnings",earning); 
	}
	
	
}
