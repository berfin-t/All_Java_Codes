import java.util.Scanner;
public class PalNum {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 7-digit number: (Write -1 to quit) ");
		int  num = input.nextInt();
		int temp = num;
		int control = num;
		int reverse = 0;
		int x = 1;
			
		while (control !=0) {
			control/=10;
			++x;
		}
		if (x>=7) {
					
			while (num != 0) {
				int rem = num % 10;
				reverse = reverse * 10 + rem;
				num = num / 10;
			}
					
			if (temp == reverse) {
				System.out.println("Number : " + temp + " is a palindrome!!!");
					
			}
			else{
				System.out.println("Number : " + temp + " is not a palindrome");
			}
				
		}
		else if (num == -1) {
			System.out.println("Program is terminating..");
		}
		else {
			System.out.println("Number must be 7 digit!");
		}
		
				
	}

}
