public class PerfectNumber {
	public static void main(String[] args) {
		int sum = 0;
		for (int n = 2; n <= 10000; n++) {
			sum = 0;
			for (int i = 1; i <= n/2; i++) {
				if (n%i == 0) {
					sum = sum + i;
				}// end if
			}// end for
			if (sum == n) {
				System.out.println(n + " Is Perfect");
			}// end if
		}// end for
	}
}