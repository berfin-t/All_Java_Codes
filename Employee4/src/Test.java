
public class Test {

	public static void main(String[] args) {
		
		Payable payableObjects[] = new Payable[ 6 ];
		
		payableObjects[0] = new Invoice("01234","seat",2,375.0);
		payableObjects[1] = new Invoice("56789","tire",4,79.95);
		payableObjects[2] = new SalariedEmployee("John","Smith","111-11-1111",800.0);
		payableObjects[3] = new HourlyEmployee("Karen","Price","222-22-2222",16.75,40.0);
		payableObjects[4] = new CommissionEmployee("Sue","Jones","333-33-3333",10000.00,0.06);
		payableObjects[5] = new BasePlusCommissionEmployee("Bob","Lewis","444-44-4444",5000.0,0.04,300.0);

		
		System.out.println("------ Invoices and Employee processed polymorphically:-------");
		
		for ( Payable currentPayable:payableObjects) {
			System.out.println(currentPayable.toString() + "\nPayment Amount: " + currentPayable.getPaymentAmount() + "\n");
		}
	
	for (int j = 0; j < payableObjects.length; j++) 
		System.out.println("Payable Object " + j + " " + "is a "+payableObjects[j].getClass().getName());
	}
}


