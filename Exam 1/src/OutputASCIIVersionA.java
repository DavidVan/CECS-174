public class OutputASCIIVersionA {
	public static void main(String[] args) {
		
		// Make First Five Rows
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 30; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Make Middle Section
		for(int i = 0; i <9; i++) {
			for(int j = 0; j < 30; j++) {
				if(j == 10 || j == 11 || j == 12 || j == 13 || j == 16 || j == 17 || j == 18 || j == 19)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// Make Last Five Rows
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 30; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}