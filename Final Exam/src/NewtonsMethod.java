// The following is for finding the square root of n
import java.util.Scanner;// for input
import java.text.*;// for DecimalFormat
public class NewtonsMethod {
	public static void main(String[] args) {
		int n;// the number to find the square root to 3 digits.
		double xN;// the guess will automatically be set for you.
		double x0; // The 0 is a zero
		double k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Natural Number: ");
		n = sc.nextInt();
		System.out.println("Take the Natural Number to which Nth Root?: ");
		k = sc.nextDouble();
		DecimalFormat df = new DecimalFormat("0.000");
		xN = n * (1.0/3.0); // The initial guess is 1/3 of n
		x0 = xN; // the substitution starts here
		xN = (1.0/k) * ((k-1) * x0+n/Math.pow(x0, k-1));
		while ((int)(1000.0*xN)/1000.0 != (int)(1000.0*x0)/1000.0) {
			System.out.println(df.format(xN));
			x0 = xN;// the substitution continue here
			xN = (1.0/k) * ((k-1) * x0+n/Math.pow(x0, k-1));
		}
		if ( k > 3) {
			System.out.println("The " + (int)k + "th root of: " + n + " = " + df.format(xN));
		}
		else if ( k == 3) {
			System.out.println("The cube root of: " + n + " = " + df.format(xN));
		}
		else {
			System.out.println("The square root of: " + n + " = " + df.format(xN));
		}
	}
}
