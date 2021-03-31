import java.util.Scanner;

public class BasePlusCommissionEmployeeTest extends BasePlusCommissionEmployee{
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Bob","Lewis","333-33-3333",5000,0.04,300);
		
		System.out.println("Employee information obtained by get methods and earnings:");
		System.out.println("\nFirst Name : " + employee.getFirstName() + "\nSecond Namme : " + employee.getLastName() + 
				"\nSocial Security Number : " + employee.getSocialSecurityNumber() + "\nGross Sales : " + employee.getGrossSales() +
				"\nCommision Rate : "+ employee.getCommisionRate() +  "\nBase Salary: " + employee.getBaseSalary() + " \nEarning : " + employee.earnings());
		
		
		employee.setBaseSalary(1000.0);
		
		System.out.printf("\nUpdated employee information obtained by toString and earnings:\n" +employee.toString1());
		
		}

}
