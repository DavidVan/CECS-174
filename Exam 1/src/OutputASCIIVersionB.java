public class OutputASCIIVersionB {
	public static void main(String[] args) {
		
		// Make First Row
		for(int i = 0; i < 30; i++) {
			if(i == 14 || i == 15) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		// Make Second Row
		for(int i = 0; i < 30; i++) {
			if(i == 12 || i == 13 || i == 14 || i == 15 || i == 16 || i == 17) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		// Make Middle Row
		for(int i = 0; i <9; i++) {
			for(int j = 0; j < 30; j++) {
				if(j == 10 || j == 11 || j == 12 || j == 17 || j == 18 || j == 19) {
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