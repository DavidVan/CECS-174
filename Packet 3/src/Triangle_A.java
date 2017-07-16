import java.util.Random;
import java.util.Scanner;
public class Triangle_A {
	public static void main(String[] args) {
		double a, b, c, x1, y1, x2, y2, x3, y3;// The points
		double cosA, cosB, cosC;
		double A, B, C;
		int count = 1;
		int acutes = 0;
		int obtuses = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many iterations do you want to run?: ");
		double iterations = sc.nextInt();
		while(count <= iterations) {
			Random random = new Random();
			x1 = random.nextDouble();
			y1 = random.nextDouble();
			x2 = random.nextDouble();
			y2 = random.nextDouble();
			x3 = random.nextDouble();
			y3 = random.nextDouble();
			a = distance(x1, y1, x2, y2);
			b = distance(x2, y2, x3, y3);
			c = distance(x1, y1, x3, y3);
			cosA = (-a*a+b*b+c*c)/(2.0*b*c);
			cosB = (-b*b+a*a+c*c)/(2.0*a*c);
			cosC = (-c*c+b*b+a*a)/(2.0*a*b);
			A = Math.acos(cosA)*180.0/Math.PI;
			B = Math.acos(cosB)*180.0/Math.PI;
			C = Math.acos(cosC)*180.0/Math.PI;
			count = count + 1;
			if(A < 90 && B < 90 && C < 90){
				acutes = acutes + 1;
			}
			else if(A > 90 || B > 90 || C > 90){
				obtuses = obtuses + 1;
			}
			else{
				count = count - 1;
			}
		}
		
		System.out.println("The percentage of acute triangles is: " + (acutes/iterations)*100);
		System.out.println("The percentage of obtuse triangles is: " + (obtuses/iterations)*100);
		System.out.println("Acutes: " + acutes);
		System.out.println("Obtuses: " + obtuses);
	}
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	}
}
