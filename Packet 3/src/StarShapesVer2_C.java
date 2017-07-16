import java.text.*;
public class StarShapesVer2_C {
	public static void main(String[] args) {
		int j = 0;
		int k = 24;
		for(int i = 15; i > 1 ; i=i-2) {
			star(i);
			blank(j);
			star(i);
			j=j+4;
			System.out.println();
		}
		star(1);
		blank(28);
		star(1);
		System.out.println();
		for(int i = 3; i <= 15 ; i=i+2) {
			star(i);
			blank(k);
			star(i);
			k=k-4;
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
