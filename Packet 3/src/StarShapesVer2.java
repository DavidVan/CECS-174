import java.text.*;
public class StarShapesVer2 {
	public static void main(String[] args) {
		star(21);
		System.out.println();
		star(21);
		System.out.println();
		for(int i = 1; i <= 10; i=i+1) {
			star(5);
			blank(11);
			star(5);
			System.out.println();
		}
		star(21);
		System.out.println();
		star(21);
		System.out.println();
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
