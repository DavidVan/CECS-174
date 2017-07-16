import java.text.*;
public class StarShapesVer2_B {
	public static void main(String[] args) {
		int j = 8;
		int k = -1;
		for(int i = 1; i <= 15; i=i+2) {
			j = j-1;
			blank(j);
			star(i);
			System.out.println();
		}
		for(int i = 15; i > 0; i=i-2) {
			k = k+1;
			blank(k);
			star(i);
			System.out.println();
		}
	}
	public static void star(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print("*");
		}
	}// end star
	public static void blank(int n) {
		for(int i=1; i<=n; i++) {
			System.out.print(" ");// a single blank
		}
	}// end blank
}// end starShapesVer2
