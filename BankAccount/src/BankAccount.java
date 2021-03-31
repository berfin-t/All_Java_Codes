import java.util.Scanner;
public class BankAccount {
	
	private static final Scanner in = new Scanner(System.in); // final keyword variable's value must either be defined directly or set in the constructor.
	private int id = 0;
	private double quantity = 0.0;
	public BankAccount(int id,double quantity) {
		this.id = id; // constructor
		this.quantity = quantity; //constructor
		
	}
	public int getId() {
		return this.id; // current id will be returned.
	}
	public double getQuantity() {
		return this.quantity;  // current quantity will be returned.
	}
	public void withdraw(double amount) {
        this.quantity -= amount; // new quantity will be returned.
    }
	public void deposit(double amount) {
        this.quantity += amount; // new quantity will be returned.
    } 
public static int checkId(int id) { // check id if it is false
        
        while (id < 1 || id > 9) {
            System.out.print("Please enter a valid id: ");
            id = in.nextInt();
            System.out.println();
        }
        return id;
    }

	public static void main(String[] args) {
		BankAccount[] Accounts = new BankAccount[9];
        for (int i = 1; i < 10; i++) { // loop for new account id and information
            Accounts[i-1] = new BankAccount(i, 100.0);
        }
        System.out.print("Enter an id: ");
        int id = in.nextInt();
        
        if (id < 0 || id > 9) {
            id = checkId(id);
        }
                
                while (true) {
                	System.out.printf("Main menu\r\n"
                			+ "1: check balance\r\n"
                			+ "2: withdraw\r\n"
                			+ "3: deposit\r\n"
                			+ "4: exit");
                    
                	System.out.print("\nEnter a choice: ");
                	int choice = in.nextInt();

                    switch (choice) {
                    case 1: 
                        System.out.printf("The balance is %.1f%n",
                                         Accounts[id].getQuantity());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        Accounts[id].withdraw(in.nextDouble());
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        Accounts[id].deposit(in.nextDouble());
                        break;
                    case 4:
                    	if (choice == 4) {
                            System.out.printf("%nEnter an id: ");
                            id = in.nextInt();

                            if (id < 0 || id > 9) {
                                id = checkId(id);
                            }
                        }
                    	break;
                    default:
                        break;
                }
                    
                }
        }
}

