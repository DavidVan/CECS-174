import java.text.*;
public class StarShapesVer2_A {
	public static void main(String[] args) {
		star(30);
		System.out.println();
		star(30);
		System.out.println();
		star(30);
		System.out.println();
		for(int i = 1; i <= 10; i=i+1) {
			star(3);
			blank(2);
			star(5);
			blank(10);
			star(5);
			blank(2);
			star(3);
			System.out.println();
		}
		star(30);
		System.out.println();
		star(30);
		System.out.println();
		star(30);
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
