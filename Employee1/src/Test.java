
public class Test {


public static void main(String[] args) {
		
	CommissionEmployee employee = new CommissionEmployee("Sue","Jones","222-22-2222",10000.0,0.06);
	
	System.out.println("---CommissionEmployee Information---\n");
	System.out.printf("%s %s%n", "First name is:",employee.getFirstName());
	System.out.printf("%s %s%n", "Last name is:",employee.getLastName());
	System.out.printf("%s %s%n", "Social security number is:",employee.getSocialSecurityNumber());
	System.out.printf("%s %s%n", "Gross sales is:",employee.getGrossSales());
	System.out.printf("%s %s%n", "Commission rate is:",employee.getCommisionRate());
	System.out.printf("%s %s%n", "Earnings:", employee.getEarning()); 
    
	 employee.setGrossSales(5000.0);  
	 employee.setCommisionRate( 0.1 ); 
	 employee.setEarning(employee.getGrossSales()*employee.getCommisionRate());
	 
	 System.out.printf( "\n%s\n%s\n", "---Updated CommissionEmployee Information ---\n", employee.toString() );
	  
		BasePlusCommissionEmployee employee1 = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000.0, 0.04,300.0);
		
		System.out.printf("\n---BasePlusCommissionEmployee Information---\n\n");
		System.out.printf("%s %s%n", "First name is:",employee1.getFirstName());
		System.out.printf("%s %s%n", "Last name is:",employee1.getLastName());
		System.out.printf("%s %s%n", "Social security number is:",employee1.getSocialSecurityNumber());
		System.out.printf("%s %s%n", "Gross sales is:",employee1.getGrossSales());
		System.out.printf("%s %s%n", "Commission rate is:",employee1.getCommisionRate());
		System.out.printf("%s %s%n", "Base salary:",employee1.getBaseSalary());
		System.out.printf("%s %s%n", "Earnings:",employee1.getEarning());
		
		employee1.setGrossSales(5000.0);  
		employee1.setCommisionRate( 0.04 ); 
		employee1.setBaseSalary(1000.0);
		employee1.setEarning(employee.getGrossSales()*employee.getCommisionRate());
		
		System.out.printf( "\n%s\n%s\n", "---Updated BasePlusCommissionEmployee Information ---\n ", employee1.toString() );
	}
	

}
