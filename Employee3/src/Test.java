
public class Test {

	public static void main(String[] args) {
		
		SalariedEmployee salariedEmployee =
				new SalariedEmployee("John", "Smith", "111-11-1111",800.00);
		HourlyEmployee hourlyEmployee =
				new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40.00);
		CommissionEmployee commissionEmployee =
				new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000.00, 0.06);
		BasePlusCommissionEmployee basePlusCommissionEmployee =
				new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000.00, 0.04, 300.00);
		
		System.out.println("----Employee information obtained by toString and earnings:----");
		System.out.println(salariedEmployee + "\nEarnings: " + salariedEmployee.earnings() );
		System.out.println(hourlyEmployee + "\nEarnings: " + hourlyEmployee.earnings() );
		System.out.println(commissionEmployee + "\nEarnings: " + commissionEmployee.earnings() );
		System.out.println(basePlusCommissionEmployee + "\nEarnings: " + basePlusCommissionEmployee.earnings() );
		
		Employee[] employees = new Employee[4];
		
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		System.out.println("\n-----Employee Array processed polymorphically-----");
		
		for ( Employee currentEmployee : employees ) {
			
			System.out.println(currentEmployee);
			
			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
				
				double oldBaseSalary = employee.getBaseSalary();
				employee.setBaseSalary(1.10*oldBaseSalary);
				
				System.out.println("new base salary with 10% increase is: " + employee.getBaseSalary());
				
				}
			System.out.println("Earnings: " + currentEmployee.earnings() + "\n");

	}
		
		for (int j = 0; j < employees.length; j++) 
			System.out.println("Employee " + j + " " + employees[j].getClass().getName());
	}

}
