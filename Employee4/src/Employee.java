
public abstract class Employee implements Payable{
	
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
	
	public String toString() {
		return  firstName  + " " + lastName
				+ "\nSocial Security Number: " + socialSecurityNumber;
	}

}
