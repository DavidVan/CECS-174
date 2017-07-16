import java.text.*;// for println
import java.util.*;// for scanner
public class Determinant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double det;
		int a1 = 0, b1 = 0, c1 = 0, d1 = 0, e1 = 0;
		int a2 = 0, b2 = 0, c2 = 0, d2 = 0, e2 = 0;
		int a3 = 0, b3 = 0, c3 = 0, d3 = 0, e3 = 0;
		int a4 = 0, b4 = 0, c4 = 0, d4 = 0, e4 = 0;
		int a5 = 0, b5 = 0, c5 = 0, d5 = 0, e5 = 0;
		System.out.print("Enter the first row in the form a1 b1 c1 d1 e1 ");
		a1 = sc.nextInt(); b1 = sc.nextInt(); c1 = sc.nextInt(); d1 = sc.nextInt(); e1 = sc.nextInt();
		System.out.print("Enter the second row in the form a2 b2 c2 d2 e2 ");
		a2 = sc.nextInt(); b2 = sc.nextInt(); c2 = sc.nextInt(); d2 = sc.nextInt(); e2 = sc.nextInt();
		System.out.print("Enter the third row in the form a3 b3 c3 d3 e3 ");
		a3 = sc.nextInt(); b3 = sc.nextInt(); c3 = sc.nextInt(); d3 = sc.nextInt(); e3 = sc.nextInt();
		System.out.print("Enter the forth row in the form a4 b4 c4 d4 e4 ");
		a4 = sc.nextInt(); b4 = sc.nextInt(); c4 = sc.nextInt(); d4 = sc.nextInt(); e4 = sc.nextInt();
		System.out.print("Enter the fifth row in the form a5 b5 c5 d5 e5 ");
		a5 = sc.nextInt(); b5 = sc.nextInt(); c5 = sc.nextInt(); d5 = sc.nextInt(); e5 = sc.nextInt();
		det = determinate(a1, b1, c1, d1, e1, a2, b2, c2, d2, e2, a3, b3, c3, d3, e3, a4, b4, c4, d4, e4, a5, b5, c5, d5, e5);
		System.out.println("The determinate is: " + det);
	}// end main calling program
	public static double determinate(int a, int b, int c, int d) {
		return 1.0*(a*d-b*c);// Convert to double and return
	}
	public static double determinate(int a, int b, int c, int d, int e, int f, int g, int h, int i) {
		return a*determinate(e, f, h, i)-b*determinate(d, f, g, i)+c*determinate(d, e, g, h);// Convert to double and return
	}
	public static double determinate(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o, int p) {
		return a*determinate(f, g, h, j, k, l, n, o, p)-b*determinate(e, g, h, i, k, l, m, o, p)+c*determinate(e, f, h, i, j, l, m, n, p)-d*determinate(e, f, g, i, j, k, m, n, o);// Convert to double and return
	}
	public static double determinate(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o, int p, int q, int r, int s, int t, int u, int v, int w, int x, int y) {
		return a*determinate(g, h, i, j, l, m, n, o, q, r, s, t, v, w, x, y)-b*determinate(f, h, i, j, k, m, n, o, p, r, s, t, u, w, x, y)+c*determinate(f, g, i, j, k, l, n, o, p, q, s, t, u, v, x, y)-d*determinate(f, g, h, j, k, l, m, o, p, q, r, t, u, v, w, y)+e*determinate(f, g, h, i, k, l, m, n, p, q, r, s, u, v, w, x);// Convert to double and return
	}
}// end SolveSystems
