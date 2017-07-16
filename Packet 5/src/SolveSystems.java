import java.text.*;// for println
import java.util.*;// for scanner
public class SolveSystems {
	public static void main(String[] args) {
		String choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("2x2 or 3x3?");
		choice = sc.nextLine();
		if (choice.equals("2x2")) {
			double det, detx, dety, x = 0.0, y = 0.0;
			int a1 = 0, b1 = 0, c1 = 0;
			int a2 = 0, b2 = 0, c2 = 0;
			System.out.print("Enter First Equation in the form a1 b1 c1 ");
			a1 = sc.nextInt(); b1 = sc.nextInt(); c1 = sc.nextInt();
			System.out.print("Enter Second Equation in the form a2 b2 c2 ");
			a2 = sc.nextInt(); b2 = sc.nextInt(); c2 = sc.nextInt();
			det = determinate(a1, b1, a2, b2);
			if (det == 0.0) {
				System.out.print("The coefficient's form a singular matrix... No Solution.");
			}
			else {
				detx = determinate(c1, b1, c2, b2);
				dety = determinate(a1, c1, a2, c2);
				x = detx/det;
				y = dety/det;
				System.out.println("The solution to the system of equations is ("+x+","+y+")");
			}
		}
		else if (choice.equals("3x3")) {
			double det, detx, dety, detz, x = 0.0, y = 0.0, z = 0.0;
			int a1 = 0, b1 = 0, c1 = 0, d1 = 0;
			int a2 = 0, b2 = 0, c2 = 0, d2 = 0;
			int a3 = 0, b3 = 0, c3 = 0, d3 = 0;
			System.out.print("Enter First Equation in the form a1 b1 c1 d1 ");
			a1 = sc.nextInt(); b1 = sc.nextInt(); c1 = sc.nextInt(); d1 = sc.nextInt();
			System.out.print("Enter Second Equation in the form a2 b2 c2 d2 ");
			a2 = sc.nextInt(); b2 = sc.nextInt(); c2 = sc.nextInt(); d2 = sc.nextInt();
			System.out.print("Enter Third Equation in the form a3 b3 c3 d3 ");
			a3 = sc.nextInt(); b3 = sc.nextInt(); c3 = sc.nextInt(); d3 = sc.nextInt();
			det = determinate(a1, b1, c1, a2, b2, c2, a3, b3, c3);
			if (det == 0.0) {
				System.out.print("The coefficient's form a singular matrix... No Solution.");
			}
			else {
				detx = determinate(d1, b1, c1, d2, b2, c2, d3, b3, c3);
				dety = determinate(a1, d1, c1, a2, d2, c2, a3, d3, c3);
				detz = determinate(a1, b1, d1, a2, b2, d2, a3, b3, d3);
				x = detx/det;
				y = dety/det;
				z = detz/det;
				System.out.println("The solution to the system of equations is ("+x+","+y+","+z+")");
			}
		}
		else {
			System.out.println("You have entered an invalid choice.");
		}
	}// end main calling program
	public static double determinate(int a, int b, int c, int d) {
		return 1.0*(a*d-b*c);// Convert to double and return
	}
	public static double determinate(int a, int b, int c, int d, int e, int f, int g, int h, int i) {
		return a*determinate(e, f, h, i)-b*determinate(d, f, g, i)+c*determinate(d, e, g, h);// Convert to double and return
	}
}// end SolveSystems
