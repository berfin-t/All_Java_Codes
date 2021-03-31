
public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee (String firstN, String lastN, String ssn) {
		firstName = firstN;
		lastName = lastN;
		socialSecurityNumber = ssn;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstN) {
		this.firstName = firstN;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastN) {
		this.lastName = lastN;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public void setSocialSecurityNumber(String ssn) {
		this.socialSecurityNumber = ssn;
	}
	
	public String toString() {
		return  firstName  + " " + lastName
				+ "\nSocial Security Number: " + socialSecurityNumber;
	}

	public abstract double earnings();
	

}
