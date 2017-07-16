// The Calculus definition of e as a Taylor series
import java.text.*;// DecimalFormat
import java.util.*;
public class Fune2 {
	public static void main(String[] args) {
		double e = 1.0;
		for (int x = 1; x <= 30; x++) {
			e = e + Math.pow(1.0, x)/factorial(x);
		}
		System.out.println("Value of e with 30 terms is: " + e);
	}// end main
	public static int factorial(int n) {
		int result = 1;
		if (n == 0) {
			return 1;
		}
		for (int j = 1; j <= n; j++) {
			result = result*j;
		}
		return result;
	}
}
