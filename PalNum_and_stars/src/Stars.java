
public class Stars {
	
	public static void main(String[] args) {
		int i,j,z;
		for (i = 1;i <= 10;i++) { // first triangle
			
			for (j = 1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		System.out.print("\n");
		
		for (i = 1; i <= 10; i++) { //second triangle

			for (j = 10; j >= i; j--) {

				System.out.print("*");

			}

			System.out.print("\n");

		}
		System.out.print("\n");
		
		for (i = 1; i <= 10; i++) { //third triangle
			
			for (z = 1; z < i; z++) {
				
				System.out.print(" ");
			}

			for (j = 10; j >= i; j--) {

				System.out.print("*");

			}
			
			System.out.print("\n");

		}
		System.out.print("\n");
		
		for (i = 1; i <= 10; i++) { //fourth triangle
			
			for (z = 10; z > i; z--) {
				
				System.out.print(" ");
			
			}

			for (j = 1; j <= i; j++) {

				System.out.print("*");

			}

			System.out.print("\n");

		}
		System.out.print(" ");

	}

}
